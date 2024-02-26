import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Extension
import extended.*

class Extended {
    companion object : IconPack {
        override val name: String = Icons::class.simpleName!!
        private val filledPack = Filled::class.simpleName + "." to Filled.entries
        private val outlinedPack = Outlined::class.simpleName + "." to Outlined.entries
        private val roundedPack = Rounded::class.simpleName + "." to Rounded.entries
        private val sharpPack = Sharp::class.simpleName + "." to Sharp.entries
        private val twoTonePack = TwoTone::class.simpleName + "." to TwoTone.entries
        override val packs = mapOf(filledPack, outlinedPack, roundedPack, sharpPack, twoTonePack)
        override val icons = filled + outlined + rounded + sharp + twoTone
        override val icon = Icons.Default.Extension
    }
}