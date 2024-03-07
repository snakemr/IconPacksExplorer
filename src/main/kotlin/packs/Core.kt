package packs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material.icons.automirrored.sharp.*
import androidx.compose.material.icons.automirrored.twotone.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.sharp.*
import androidx.compose.material.icons.twotone.*

class Core {
    companion object : IconPack {
        private val filledMirrored = listOf(
            Icons.AutoMirrored.Filled.ArrowBack,
            Icons.AutoMirrored.Filled.ArrowForward,
            Icons.AutoMirrored.Filled.ExitToApp,
            Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            Icons.AutoMirrored.Filled.KeyboardArrowRight,
            Icons.AutoMirrored.Filled.List,
            Icons.AutoMirrored.Filled.Send
        )
        private val outlinedMirrored = listOf(
            Icons.AutoMirrored.Outlined.ArrowBack,
            Icons.AutoMirrored.Outlined.ArrowForward,
            Icons.AutoMirrored.Outlined.ExitToApp,
            Icons.AutoMirrored.Outlined.KeyboardArrowLeft,
            Icons.AutoMirrored.Outlined.KeyboardArrowRight,
            Icons.AutoMirrored.Outlined.List,
            Icons.AutoMirrored.Outlined.Send
        )
        private val roundedMirrored = listOf(
            Icons.AutoMirrored.Rounded.ArrowBack,
            Icons.AutoMirrored.Rounded.ArrowForward,
            Icons.AutoMirrored.Rounded.ExitToApp,
            Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
            Icons.AutoMirrored.Rounded.KeyboardArrowRight,
            Icons.AutoMirrored.Rounded.List,
            Icons.AutoMirrored.Rounded.Send
        )
        private val sharpMirrored = listOf(
            Icons.AutoMirrored.Sharp.ArrowBack,
            Icons.AutoMirrored.Sharp.ArrowForward,
            Icons.AutoMirrored.Sharp.ExitToApp,
            Icons.AutoMirrored.Sharp.KeyboardArrowLeft,
            Icons.AutoMirrored.Sharp.KeyboardArrowRight,
            Icons.AutoMirrored.Sharp.List,
            Icons.AutoMirrored.Sharp.Send
        )
        private val twoToneMirrored = listOf(
            Icons.AutoMirrored.TwoTone.ArrowBack,
            Icons.AutoMirrored.TwoTone.ArrowForward,
            Icons.AutoMirrored.TwoTone.ExitToApp,
            Icons.AutoMirrored.TwoTone.KeyboardArrowLeft,
            Icons.AutoMirrored.TwoTone.KeyboardArrowRight,
            Icons.AutoMirrored.TwoTone.List,
            Icons.AutoMirrored.TwoTone.Send
        )

        private val filled = listOf(
            Icons.Filled.AccountBox,
            Icons.Filled.AccountCircle,
            Icons.Filled.AddCircle,
            Icons.Filled.Add,
            Icons.Filled.ArrowDropDown,
            Icons.Filled.Build,
            Icons.Filled.Call,
            Icons.Filled.CheckCircle,
            Icons.Filled.Check,
            Icons.Filled.Clear,
            Icons.Filled.Close,
            Icons.Filled.Create,
            Icons.Filled.DateRange,
            Icons.Filled.Delete,
            Icons.Filled.Done,
            Icons.Filled.Edit,
            Icons.Filled.Email,
            Icons.Filled.Face,
            Icons.Filled.FavoriteBorder,
            Icons.Filled.Favorite,
            Icons.Filled.Home,
            Icons.Filled.Info,
            Icons.Filled.KeyboardArrowDown,
            Icons.Filled.KeyboardArrowUp,
            Icons.Filled.LocationOn,
            Icons.Filled.Lock,
            Icons.Filled.MailOutline,
            Icons.Filled.Menu,
            Icons.Filled.MoreVert,
            Icons.Filled.Notifications,
            Icons.Filled.Person,
            Icons.Filled.Phone,
            Icons.Filled.Place,
            Icons.Filled.PlayArrow,
            Icons.Filled.Refresh,
            Icons.Filled.Search,
            Icons.Filled.Settings,
            Icons.Filled.Share,
            Icons.Filled.ShoppingCart,
            Icons.Filled.Star,
            Icons.Filled.ThumbUp,
            Icons.Filled.Warning
        )
        private val outlined = listOf(
            Icons.Outlined.AccountBox,
            Icons.Outlined.AccountCircle,
            Icons.Outlined.AddCircle,
            Icons.Outlined.Add,
            Icons.Outlined.ArrowDropDown,
            Icons.Outlined.Build,
            Icons.Outlined.Call,
            Icons.Outlined.CheckCircle,
            Icons.Outlined.Check,
            Icons.Outlined.Clear,
            Icons.Outlined.Close,
            Icons.Outlined.Create,
            Icons.Outlined.DateRange,
            Icons.Outlined.Delete,
            Icons.Outlined.Done,
            Icons.Outlined.Edit,
            Icons.Outlined.Email,
            Icons.Outlined.Face,
            Icons.Outlined.FavoriteBorder,
            Icons.Outlined.Favorite,
            Icons.Outlined.Home,
            Icons.Outlined.Info,
            Icons.Outlined.KeyboardArrowDown,
            Icons.Outlined.KeyboardArrowUp,
            Icons.Outlined.LocationOn,
            Icons.Outlined.Lock,
            Icons.Outlined.MailOutline,
            Icons.Outlined.Menu,
            Icons.Outlined.MoreVert,
            Icons.Outlined.Notifications,
            Icons.Outlined.Person,
            Icons.Outlined.Phone,
            Icons.Outlined.Place,
            Icons.Outlined.PlayArrow,
            Icons.Outlined.Refresh,
            Icons.Outlined.Search,
            Icons.Outlined.Settings,
            Icons.Outlined.Share,
            Icons.Outlined.ShoppingCart,
            Icons.Outlined.Star,
            Icons.Outlined.ThumbUp,
            Icons.Outlined.Warning
        )
        private val rounded = listOf(
            Icons.Rounded.AccountBox,
            Icons.Rounded.AccountCircle,
            Icons.Rounded.AddCircle,
            Icons.Rounded.Add,
            Icons.Rounded.ArrowDropDown,
            Icons.Rounded.Build,
            Icons.Rounded.Call,
            Icons.Rounded.CheckCircle,
            Icons.Rounded.Check,
            Icons.Rounded.Clear,
            Icons.Rounded.Close,
            Icons.Rounded.Create,
            Icons.Rounded.DateRange,
            Icons.Rounded.Delete,
            Icons.Rounded.Done,
            Icons.Rounded.Edit,
            Icons.Rounded.Email,
            Icons.Rounded.Face,
            Icons.Rounded.FavoriteBorder,
            Icons.Rounded.Favorite,
            Icons.Rounded.Home,
            Icons.Rounded.Info,
            Icons.Rounded.KeyboardArrowDown,
            Icons.Rounded.KeyboardArrowUp,
            Icons.Rounded.LocationOn,
            Icons.Rounded.Lock,
            Icons.Rounded.MailOutline,
            Icons.Rounded.Menu,
            Icons.Rounded.MoreVert,
            Icons.Rounded.Notifications,
            Icons.Rounded.Person,
            Icons.Rounded.Phone,
            Icons.Rounded.Place,
            Icons.Rounded.PlayArrow,
            Icons.Rounded.Refresh,
            Icons.Rounded.Search,
            Icons.Rounded.Settings,
            Icons.Rounded.Share,
            Icons.Rounded.ShoppingCart,
            Icons.Rounded.Star,
            Icons.Rounded.ThumbUp,
            Icons.Rounded.Warning
        )
        private val sharp = listOf(
            Icons.Sharp.AccountBox,
            Icons.Sharp.AccountCircle,
            Icons.Sharp.AddCircle,
            Icons.Sharp.Add,
            Icons.Sharp.ArrowDropDown,
            Icons.Sharp.Build,
            Icons.Sharp.Call,
            Icons.Sharp.CheckCircle,
            Icons.Sharp.Check,
            Icons.Sharp.Clear,
            Icons.Sharp.Close,
            Icons.Sharp.Create,
            Icons.Sharp.DateRange,
            Icons.Sharp.Delete,
            Icons.Sharp.Done,
            Icons.Sharp.Edit,
            Icons.Sharp.Email,
            Icons.Sharp.Face,
            Icons.Sharp.FavoriteBorder,
            Icons.Sharp.Favorite,
            Icons.Sharp.Home,
            Icons.Sharp.Info,
            Icons.Sharp.KeyboardArrowDown,
            Icons.Sharp.KeyboardArrowUp,
            Icons.Sharp.LocationOn,
            Icons.Sharp.Lock,
            Icons.Sharp.MailOutline,
            Icons.Sharp.Menu,
            Icons.Sharp.MoreVert,
            Icons.Sharp.Notifications,
            Icons.Sharp.Person,
            Icons.Sharp.Phone,
            Icons.Sharp.Place,
            Icons.Sharp.PlayArrow,
            Icons.Sharp.Refresh,
            Icons.Sharp.Search,
            Icons.Sharp.Settings,
            Icons.Sharp.Share,
            Icons.Sharp.ShoppingCart,
            Icons.Sharp.Star,
            Icons.Sharp.ThumbUp,
            Icons.Sharp.Warning
        )
        private val twoTone = listOf(
            Icons.TwoTone.AccountBox,
            Icons.TwoTone.AccountCircle,
            Icons.TwoTone.AddCircle,
            Icons.TwoTone.Add,
            Icons.TwoTone.ArrowDropDown,
            Icons.TwoTone.Build,
            Icons.TwoTone.Call,
            Icons.TwoTone.CheckCircle,
            Icons.TwoTone.Check,
            Icons.TwoTone.Clear,
            Icons.TwoTone.Close,
            Icons.TwoTone.Create,
            Icons.TwoTone.DateRange,
            Icons.TwoTone.Delete,
            Icons.TwoTone.Done,
            Icons.TwoTone.Edit,
            Icons.TwoTone.Email,
            Icons.TwoTone.Face,
            Icons.TwoTone.FavoriteBorder,
            Icons.TwoTone.Favorite,
            Icons.TwoTone.Home,
            Icons.TwoTone.Info,
            Icons.TwoTone.KeyboardArrowDown,
            Icons.TwoTone.KeyboardArrowUp,
            Icons.TwoTone.LocationOn,
            Icons.TwoTone.Lock,
            Icons.TwoTone.MailOutline,
            Icons.TwoTone.Menu,
            Icons.TwoTone.MoreVert,
            Icons.TwoTone.Notifications,
            Icons.TwoTone.Person,
            Icons.TwoTone.Phone,
            Icons.TwoTone.Place,
            Icons.TwoTone.PlayArrow,
            Icons.TwoTone.Refresh,
            Icons.TwoTone.Search,
            Icons.TwoTone.Settings,
            Icons.TwoTone.Share,
            Icons.TwoTone.ShoppingCart,
            Icons.TwoTone.Star,
            Icons.TwoTone.ThumbUp,
            Icons.TwoTone.Warning
        )

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

        override val icon = Icons.Default.Face
    }

    enum class Packs { Filled, Outlined, Rounded, Sharp, TwoTone, AutoMirrored }

    enum class AutoMirrored {
        ArrowBack,
        ArrowForward,
        ExitToApp,
        KeyboardArrowLeft,
        KeyboardArrowRight,
        List,
        Send
    }

    enum class All {
        AccountBox,
        AccountCircle,
        AddCircle,
        Add,
        ArrowDropDown,
        Build,
        Call,
        CheckCircle,
        Check,
        Clear,
        Close,
        Create,
        DateRange,
        Delete,
        Done,
        Edit,
        Email,
        Face,
        FavoriteBorder,
        Favorite,
        Home,
        Info,
        KeyboardArrowDown,
        KeyboardArrowUp,
        LocationOn,
        Lock,
        MailOutline,
        Menu,
        MoreVert,
        Notifications,
        Person,
        Phone,
        Place,
        PlayArrow,
        Refresh,
        Search,
        Settings,
        Share,
        ShoppingCart,
        Star,
        ThumbUp,
        Warning
    }
}