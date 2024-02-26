import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

val packs = setOf(
    Default, Simple, Feather, Tabler, Eva, FontAwesome, Octicons, Linea, LineAwesome, Weather, CssGg, Extended
)

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun App() {
    var pack: IconPack by remember { mutableStateOf(Extended) }
    val names by remember { derivedStateOf { pack.names() } }
    val subPacks by remember { derivedStateOf { pack.packs() } }
    var search by remember { mutableStateOf("") }
    val found by remember { derivedStateOf {
        names.mapIndexedNotNull { index, s ->
            if (s.contains(search, true)) index else null
        }
    } }
    val tips by remember { derivedStateOf { names.slice(found) } }
    val list by remember { derivedStateOf { pack.icons.slice(found) } }
    val state = rememberLazyGridState()
    val scope = rememberCoroutineScope()
    var size by remember { mutableStateOf(50.dp) }
    var toast by remember { mutableStateOf("") }

    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            var menu1 by remember { mutableStateOf(false) }
            var menu2 by remember { mutableStateOf(false) }
            ExposedDropdownMenuBox(menu1, {}, Modifier.padding(horizontal = 4.dp).weight(2f).border(Dp.Hairline, Color.LightGray)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(if (search == "") Icons.Default.Search else Icons.Default.Clear, null,
                        Modifier.clickable(search != "") { search = "" })
                    BasicTextField(
                        search, { search = it },
                        Modifier.weight(1f).padding(4.dp), maxLines = 1)
                    if (subPacks.size > 1)
                        Icon(Icons.Default.ArrowDropDown, null, Modifier.clickable { menu1 = !menu1 })
                }
                ExposedDropdownMenu(menu1, { menu1 = false }) {
                    subPacks.forEach { (name, size) ->
                        ListItem(Modifier.clickable {
                            menu1 = false
                            search = name + "." + search.substringAfter(".")
                        }) {
                            Text("$name ($size)")
                        }
                    }
                }
            }
            ExposedDropdownMenuBox(menu2, { menu2 = it }, Modifier.weight(2f).border(Dp.Hairline, Color.LightGray)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(pack.icon, null, Modifier.padding(horizontal = 4.dp).size(24.dp))
                    Text(pack.name, Modifier.padding(4.dp).weight(1f))
                    Icon(Icons.Default.ArrowDropDown, null)
                }
                ExposedDropdownMenu(menu2, { menu2 = false }) {
                    packs.forEach {
                        ListItem(Modifier.clickable { menu2 = false ; pack = it }, {
                            Icon(it.icon, null, Modifier.size(32.dp))
                        }) {
                            Text(it.name + " (" + it.icons.size + ")")
                        }
                    }
                }
            }
            Slider(size.value, { size = it.dp }, Modifier.weight(1f), valueRange = 20f..100f, steps = 79,
                colors = SliderDefaults.colors(thumbColor = Color.Black, activeTrackColor = Color.Gray))
        }
        Box {
            LazyVerticalGrid(GridCells.Adaptive(size), Modifier.draggable(rememberDraggableState {
                scope.launch { state.scrollBy(-it) }
            }, Orientation.Vertical), state) {
                itemsIndexed(list) { index, icon ->
                    TooltipArea({
                        Tooltip {
                            Text(tips.getOrNull(index) ?: "", Modifier.padding(8.dp), fontSize = 20.sp)
                        }
                    }) {
                        Icon(icon, null, Modifier.aspectRatio(1f).clickable {
                            scope.launch {
                                with(pack.name + "." + tips.getOrNull(index)) {
                                    copyToClipboard()
                                    toast = "$this copied to clipboard"
                                    delay(1000)
                                    toast = ""
                                }
                            }
                        }.padding(8.dp))
                    }
                }
            }
            VerticalScrollbar(rememberScrollbarAdapter(state), Modifier.fillMaxHeight().align(Alignment.TopEnd))
            if (toast != "")
                Snackbar(Modifier.align(Alignment.BottomStart).padding(10.dp)) { Text(toast) }
        }
    }
}

@Composable
private fun Tooltip(content: @Composable ()->Unit) {
    val front = remember { Color(0xFF000023) }
    val back = remember { Color(0xFFFFFFCA) }
    val shape = remember { RoundedCornerShape(10.dp) }
    val border = remember { BorderStroke(Dp.Hairline, front) }
    val alpha = remember { Modifier.alpha(.9f) }
    Card(alpha, shape, back, front, border, 10.dp) {
        content()
    }
}

private fun String.copyToClipboard() = Toolkit.getDefaultToolkit().systemClipboard.setContents(
    StringSelection(this), null
)