package packs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Extension
import packs.extended.*
import packs.Core.Packs

class Extended {
    companion object : IconPack {
        override val name: String = Icons::class.simpleName!!

        private val filledMirroredPack = Packs.AutoMirrored.name + "." + Packs.Filled.name + "." to AutoMirrored.entries
        private val outlinedMirroredPack = Packs.AutoMirrored.name + "." + Packs.Outlined.name + "." to AutoMirrored.entries
        private val roundedMirroredPack = Packs.AutoMirrored.name + "." + Packs.Rounded.name + "." to AutoMirrored.entries
        private val sharpMirroredPack = Packs.AutoMirrored.name + "." + Packs.Sharp.name + "." to AutoMirrored.entries
        private val twoToneMirroredPack = Packs.AutoMirrored.name + "." + Packs.TwoTone.name + "." to AutoMirrored.entries

        private val filledPack = Packs.Filled.name + "." to All.entries
        private val outlinedPack = Packs.Outlined.name + "." to All.entries
        private val roundedPack = Packs.Rounded.name + "." to All.entries
        private val sharpPack = Packs.Sharp.name + "." to All.entries
        private val twoTonePack = Packs.TwoTone.name + "." to All.entries

        override val packs = mapOf(
            filledMirroredPack, filledPack,
            outlinedMirroredPack, outlinedPack,
            roundedMirroredPack, roundedPack,
            sharpMirroredPack, sharpPack,
            twoToneMirroredPack, twoTonePack
        )

        override val icons =
            filledMirrored + filled +
            outlinedMirrored + outlined +
            roundedMirrored + rounded +
            sharpMirrored + sharp +
            twoToneMirrored + twoTone

        override val icon = Icons.Default.Extension
    }
}