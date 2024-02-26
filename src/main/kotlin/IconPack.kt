import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.enums.EnumEntries

interface IconPack {
    val name: String
    val icon: ImageVector
    val icons: List<ImageVector>
    val packs: Map<String, EnumEntries<*>>
    fun names() = packs.flatMap { (name, enum) ->
        enum.map { name + it.name }
    }
    fun packs() = packs.map { it.key.dropLast(1) to it.value.size }
}

//fun namesOf(vararg enums: EnumEntries<*>) = enums.flatMap { enum ->
//    enum.map { it.name }
//}
//
//fun namesOf(vararg enums: Pair<String?, EnumEntries<*>>) = enums.flatMap { (name, enum) ->
//    enum.map { name + "." + it.name }
//}