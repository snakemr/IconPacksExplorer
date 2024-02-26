import compose.icons.AllIcons
import compose.icons.EvaIcons
import compose.icons.evaicons.Outline
import compose.icons.evaicons.outline.SmilingFace

class Eva {
    companion object : IconPack {
        override val name: String = EvaIcons::class.simpleName!!
        private val outline = Outline::class.simpleName + "." to Outline.entries
        private val fill = Fill::class.simpleName + "." to Fill.entries
        override val packs = mapOf(outline, fill)
        override val icons = EvaIcons.AllIcons
        override val icon = EvaIcons.Outline.SmilingFace
    }

    enum class Outline {
        Funnel, CornerRightUp, ArrowDown, PlayCircle, Shuffle2, ArrowCircleDown,
        ThermometerPlus, Google, Bookmark, ArrowheadUp, Flag, ArrowheadRight, QuestionMarkCircle,
        Layers, Close, Menu, Swap, Tv, Repeat, PlusCircle, CornerUpLeft, Recording, ArrowBack,
        Maximize, CloudUpload, CornerDownLeft, Book, PersonAdd, CloseSquare, MinusSquare, Collapse,
        List, Attach, TrendingDown, LogOut, DiagonalArrowRightUp, Sun, Clipboard, AlertCircle,
        ArrowIosUpward, ArrowCircleLeft, Umbrella, RadioButtonOff, Browser, ArrowIosForward,
        ArrowRight, ArrowForward, Behance, MessageCircle, Npm, Twitter, TrendingUp, Code,
        CreditCard, Camera, Cast, SkipBack, Award, Plus, VolumeUp, MenuArrow, DoneAll, Shake,
        PaperPlane, Info, WifiOff, DiagonalArrowRightDown, Shield, RewindRight, Phone, PlusSquare,
        RewindLeft, Compass, Pantone, Map, PersonDone, Navigation, ShoppingBag, Eye, Star, ArrowUp,
        DiagonalArrowLeftUp, VolumeOff, Mic, Flip, Video, Calendar, Brush, People, Square,
        Smartphone, Link, ColorPicker, MinusCircle, Trash2, AlertTriangle, DiagonalArrowLeftDown,
        Facebook, At, Radio, Monitor, Bluetooth, Trash, ChevronRight, QuestionMark, ShoppingCart,
        CornerRightDown, Thermometer, ArrowIosDownward, EyeOff, SmilingFace, Pin, CloseCircle,
        Menu2, Headphones, Music, Scissors, ChevronLeft, ArrowUpward, ArrowDownward, PhoneOff, Home,
        Flash, PhoneCall, Copy, File, Expand, ArrowLeft, Shuffle, Grid, Refresh, ArrowIosBack,
        Folder, Search, Power, Linkedin, ColorPalette, FolderRemove, FlashOff, ToggleRight,
        CheckmarkSquare2, PhoneMissed, Settings, CornerDownRight, BellOff, CodeDownload,
        CheckmarkCircle2, Bell, EyeOff2, CornerLeftUp, Bulb, CheckmarkSquare, PauseCircle, Keypad,
        Move, FileText, Options2, BookOpen, BarChart2, MicOff, VolumeDown, Sync, CloudDownload,
        Moon, PersonRemove, FolderAdd, HardDrive, Briefcase, Pricetags, Attach2, ArrowCircleRight,
        ThermometerMinus, VideoOff, Globe, CheckmarkCircle, ChevronUp, StopCircle, Upload, Lock,
        SkipForward, Backspace, Download, Email, PersonDelete, Flip2, Cube, CornerLeftDown, Clock,
        LogIn, MessageSquare, BarChart, ChevronDown, ArrowheadDown, Navigation2, Checkmark, Layout,
        Image, Heart, Battery, Car, Hash, DropletOff, Printer, Github, Person, Save, Crop, PieChart,
        ToggleLeft, ArrowCircleUp, RadioButtonOn, Edit, VolumeMute, ShieldOff, CornerUpRight,
        Minimize, Link2, Wifi, Settings2, Globe2, MoreHorizontal, Droplet, Unlock, Slash, Gift,
        MoreVertical, Minus, Undo, Options, Loader, Charging, Text, FileAdd, Film, Edit2, Inbox,
        ExternalLink, FileRemove, Archive, ArrowheadLeft, Percent, Share, Activity, Speaker
    }

    enum class Fill {
        Link2, PlayCircle, Car, SkipForward, CheckmarkCircle2, ArrowIosBack,
        VolumeMute, Camera, ShieldOff, PhoneOff, Percent, PhoneMissed, Plus, Minus, Backspace,
        RadioButtonOff, Upload, Cube, Globe2, CheckmarkSquare, RewindLeft, CornerDownLeft, Keypad,
        CornerUpRight, Maximize, PlusCircle, Refresh, ArrowForward, Layers, Shuffle2, ArrowUp,
        Person, MoreVertical, Npm, DropletOff, ChevronDown, CloudDownload, Shake,
        DiagonalArrowRightDown, ArrowCircleLeft, Radio, Code, CornerRightUp, Settings2, Attach2,
        LogOut, VolumeDown, Home, CheckmarkCircle, CodeDownload, Printer, Moon, BellOff, Clock,
        Edit2, Shield, QuestionMark, Award, StopCircle, Slash, LogIn, Flip2, ArrowBack, Settings,
        ToggleRight, List, Phone, Flag, Collapse, Google, CornerDownRight, DoneAll, Charging,
        ToggleLeft, RewindRight, Attach, Smartphone, Recording, Edit, ArrowCircleUp, ArrowLeft,
        Layout, ShoppingBag, ArrowDown, Film, DiagonalArrowRightUp, WifiOff, Eye, Scissors,
        ArrowheadLeft, Briefcase, Grid, Sun, Battery, CornerRightDown, ArrowCircleRight, FileAdd,
        ArrowheadUp, SkipBack, Video, Flash, ThermometerPlus, Email, MinusCircle, Unlock, PieChart2,
        MinusSquare, Flip, Close, MessageCircle, Options2, Undo, Menu, CornerLeftUp, PersonDelete,
        Image, VolumeUp, Crop, Image2, ArrowDownward, EyeOff, PauseCircle, Clipboard, BarChart2,
        File, Book, Text, Globe, ChevronUp, VideoOff, FolderRemove, Save, ColorPicker, Options,
        Sync, MicOff, SmilingFace, Pricetags, PlusSquare, Menu2, Copy, ArrowIosForward, Gift,
        Calendar, Move, Music, Thermometer, Search, Activity, Folder, Linkedin, Expand, Bluetooth,
        Bookmark, Twitter, ArrowheadDown, Funnel, Trash, Navigation2, Umbrella, PersonRemove,
        ThermometerMinus, QuestionMarkCircle, ArrowRight, AlertCircle, Wifi, Power, Headphones,
        Pantone, ExternalLink, AlertTriangle, Swap, HardDrive, PaperPlane, CheckmarkSquare2,
        Download, ArrowCircleDown, Link, Shuffle, MessageSquare, Speaker, DiagonalArrowLeftUp,
        People, Info, PersonDone, VolumeOff, Droplet, Map, Facebook, Square, EyeOff2, PersonAdd,
        TrendingDown, CornerUpLeft, CloseSquare, MoreHorizontal, BookOpen, ColorPalette, Star,
        ArrowUpward, ChevronLeft, Checkmark, Tv, CloseCircle, At, DiagonalArrowLeftDown, MenuArrow,
        Hash, FlashOff, Inbox, Behance, Repeat, Lock, Pin, Bulb, Share, FileText, CornerLeftDown,
        Trash2, Compass, Navigation, ArrowheadRight, Globe3, FolderAdd, ShoppingCart, CreditCard,
        PhoneCall, Archive, Minimize, CloudUpload, Monitor, RadioButtonOn, ArrowIosDownward,
        ArrowIosUpward, ChevronRight, Browser, Heart, Bell, Github, Mic, FileRemove, Cast, BarChart,
        TrendingUp, Brush, PieChart
    }
}