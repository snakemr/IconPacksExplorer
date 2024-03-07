package packs

import compose.icons.AllIcons
import compose.icons.FeatherIcons
import compose.icons.feathericons.Feather

class Feather {
    companion object : IconPack {
        override val name: String = FeatherIcons::class.simpleName!!
        private val all = "" to Icons.entries
        override val packs = mapOf(all)
        override val icons = FeatherIcons.AllIcons
        override val icon = FeatherIcons.Feather
    }

    enum class Icons {
        Link2, PlayCircle, XOctagon, UserCheck, AlignLeft, Columns, SkipForward,
        Rewind, Underline, Pause, Tablet, GitMerge, Camera, ShieldOff, ArrowDownRight, Delete,
        PhoneOff, Percent, VolumeX, PhoneMissed, Plus, Minus, Play, CloudDrizzle, Upload,
        CloudLightning, Divide, GitCommit, Edit3, RefreshCcw, GitBranch, CornerDownLeft, ThumbsDown,
        CornerUpRight, ChevronsRight, Maximize, PlusCircle, Box, Layers, ArrowUp, BatteryCharging,
        RotateCcw, ZoomOut, MoreVertical, Circle, Aperture, ZoomIn, ChevronDown, HelpCircle,
        UploadCloud, Truck, Radio, Code, CornerRightUp, Package, LogOut, Target, Gitlab, Home,
        MousePointer, ArrowLeftCircle, Database, Printer, Moon, BellOff, ChevronsDown, Clock,
        UserMinus, Edit2, ArrowUpLeft, ArrowUpRight, Shield, PhoneForwarded, Crosshair, Award,
        AlignCenter, StopCircle, Slash, LogIn, AtSign, ZapOff, Settings, Sidebar, Type, CheckSquare,
        ToggleRight, Triangle, List, Phone, Users, Sunrise, Anchor, Flag, Italic, Hexagon,
        AlignJustify, CornerDownRight, Terminal, ToggleLeft, Smartphone, Edit, UserPlus, ArrowLeft,
        Layout, DollarSign, Disc, ShoppingBag, ArrowDown, Film, Codepen, WifiOff, UserX, Eye,
        Voicemail, Scissors, Briefcase, Minimize2, Grid, ArrowUpCircle, ChevronsLeft, Sun,
        Codesandbox, Send, Battery, CornerRightDown, PhoneOutgoing, SkipBack, Video, Dribbble,
        FolderMinus, FastForward, RefreshCw, MinusCircle, Unlock, PenTool, MinusSquare, Sliders,
        MessageCircle, Menu, CornerLeftUp, Paperclip, Image, Crop, ArrowRightCircle, Volume, Tool,
        Frown, EyeOff, PauseCircle, Tag, Clipboard, BarChart2, File, Airplay, Book, Check, Globe,
        Zap, Server, Smile, ChevronsUp, ChevronUp, Sunset, Cpu, VideoOff, Volume1, Save, Rss,
        RotateCw, Slack, MicOff, Loader, AlignRight, Watch, PlusSquare, Copy, Wind, FilePlus, Gift,
        Calendar, Move, CameraOff, Music, Framer, Thermometer, Trello, Filter, Search, Activity,
        Folder, Linkedin, Bluetooth, Bookmark, Twitter, Maximize2, Trash, Navigation2, Umbrella,
        Key, X, ArrowRight, AlertCircle, Wifi, Power, Headphones, DivideSquare, Meh, ExternalLink,
        Figma, AlertTriangle, Youtube, HardDrive, Command, ArrowDownCircle, Download, Link, Shuffle,
        DivideCircle, MessageSquare, Speaker, PhoneIncoming, Info, Twitch, Droplet, Map, Facebook,
        Square, TrendingDown, FileMinus, CornerUpLeft, CloudOff, MoreHorizontal, BookOpen, Star,
        Coffee, ChevronLeft, Tv, CheckCircle, Hash, Inbox, FolderPlus, Mail, Repeat, Lock, Feather,
        Share, FileText, ThumbsUp, MapPin, CornerLeftDown, Trash2, Compass, Navigation, Octagon,
        Chrome, Volume2, Instagram, XCircle, CloudRain, DownloadCloud, ShoppingCart, AlertOctagon,
        CreditCard, PhoneCall, Archive, Bold, Minimize, LifeBuoy, Monitor, XSquare, Pocket,
        ChevronRight, Share2, Heart, Bell, Github, Mic, Cast, ArrowDownLeft, BarChart, CloudSnow,
        TrendingUp, Cloud, PieChart, GitPullRequest, User
    }
}