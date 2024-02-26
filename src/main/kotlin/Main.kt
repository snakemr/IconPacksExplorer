import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "All Icon Packs", icon = rememberVectorPainter(Default.icon)) {
        App()
    }
}
