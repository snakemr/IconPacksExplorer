package packs

import compose.icons.AllIcons
import compose.icons.LineaIcons
import compose.icons.lineaicons.Software
import compose.icons.lineaicons.software.VectorLine

class Linea {
    companion object : IconPack {
        override val name: String = LineaIcons::class.simpleName!!
        private val music = Music::class.simpleName + "." to Music.entries
        private val ecommerce = Ecommerce::class.simpleName + "." to Ecommerce.entries
        private val basic = Basic::class.simpleName + "." to Basic.entries
        private val software = Software::class.simpleName + "." to Software.entries
        private val weather = Weather::class.simpleName + "." to Weather.entries
        private val arrows = Arrows::class.simpleName + "." to Arrows.entries
        private val basicElaboration = BasicElaboration::class.simpleName + "." to BasicElaboration.entries
        override val packs = mapOf(music, ecommerce, basic, software, weather, arrows, basicElaboration)
        override val icons = LineaIcons.AllIcons
        override val icon = LineaIcons.Software.VectorLine
    }

    enum class Music {
        Mixer, Bell, Ipod, Microphone, PlayButton, Diapason, Playlist, VolumeDown,
        PauseButton, BeginningButton, Cd, RepeatButton, RadioGhettoblaster, Record, Headphones,
        StopButton, Tape, NoteSingle, MicrophoneOld, Recordplayer, VolumeUp, Loudspeaker,
        NoteMultiple, EjectButton, RewindButton, FastforwardButton, ShuffleButton, Mute,
        RadioPortable, EndButton
    }

    enum class Ecommerce {
        CartContent, Sale, ReceiptLira, Dollar, ReceiptPesos, GraphIncrease,
        ReceiptRupee, BagRemove, Rublo, BasketCloud, Naira, Euro, CartSearch, BagUpload, Bath,
        Money, BasketPlus, Creditcard, BasketMinus, ReceiptKips, Receipt, Ticket, Yen, Cart,
        GraphDecrease, CartCheck, ReceiptTugrik, Safe, BasketSearch, Lira, BagDownload, ReceiptWon,
        ReceiptPound, Bag, ReceiptFranc, ReceiptEuro, Megaphone, Guarani, ReceiptBath, BagCheck,
        Kips, BasketRefresh, Wallet, Tugriks, Franc, Banknote, BasketRemove, Won, CartRefresh,
        Sales, BagRefresh, Gift, Pound, BasketUpload, CartDownload, Yen2, BasketCheck,
        BasketDownload, Cent, Graph3, CartMinus, CartUpload, BagSearch, BagCloud, ReceiptDollar,
        Banknotes, Graph2, ReceptColon, ReceiptGuarani, BagPlus, Graph1, Pesos, ReceiptRublo, Rupee,
        Basket, CartPlus, ReceiptYen2, CartCloud, ReceiptNaira, BagMinus, ReceiptYen, CartRemove,
        Colon, ReceiptCent, Diamond
    }

    enum class Basic {
        MailMultiple, Photo, Settings, TodoTxt, Cup, Heart, MessageMultiple, Mouse,
        Book, Download, Headset, Alarm, PostcardMultiple, Question, SheetPen, NotebookPen,
        HeartBroken, Keyboard, Info, BatteryCharge, Ipod, Postcard, Gear, CardsDiamonds,
        MailOpenText, LockOpen, Spread, Target, Spades, Floppydisk, WebpageTxt, Globe, BatteryFull,
        Case, Link, Joypad, Cloud, Video, Lock, Eye, Smartphone, Bolt, Share, Signs, Clock,
        Clessidre, MagnifierMinus, SpreadBookmark, TodolistPen, Mail, SheetMultiple, MailOpen,
        ServerCloud, Flag1, Server, Exclamation, LifeBuoy, Webpage, EyeClosed, Helm, Flag2, Male,
        TrashcanFull, CardsHearts, Server2, Archive, Accelerator, TrashcanRemove,
        SpreadTextBookmark, TodoPen, BatteryHalf, Todo, Home, SpreadText, ServerDownload, Watch,
        World, Calendar, PencilRulerPen, SheetTxt, Compass, BatteryEmpty, PencilRuler,
        FolderMultiple, PictureMultiple, Anticlockwise, Chronometer, TrashcanRefresh, Rss,
        Geolocalize05, MessageTxt, Ban, Clockwise, Printer, Gunsight, Hammer, Anchor, BookPencil,
        Geolocalize01, Pin2, Picture, Message, SheetPencil, WebpageImgTxt, Key, Notebook,
        ServerUpload, Clubs, BookPen, Diamonds, Magnifier, Pin1, Bookmark, MagicMouse,
        NotebookPencil, Star, ArchiveFull, Laptop, Mixer2, TodoPencil, Usb, Map, WebpageMultiple,
        Female, Folder, Paperplane, Display, Lightbulb, Sheet, Upload, MagnifierPlus, Tablet,
        Trashcan, TodolistPencil, Calculator
    }

    enum class Software {
        VectorComposite, ParagraphCenter, Paragraph, HorizontalAlignLeft,
        Paintroller, Slice, VectorBox, VerticalDistributeBottom, ParagraphAlignRight, VectorLine,
        LayoutHeaderComplex, LayoutHeader4columns, PathfinderExclude, ParagraphSpaceAfter,
        IndentRight, VerticalDistributeTop, ParagraphAlignLeft, ParagraphJustifyCenter,
        Layout8boxes, Layout4lines, LayoutHeader, VerticalAlignCenter, BoxRoundedrectangle,
        HorizontalAlignCenter, Layout4boxes, Crop, ParagraphJustifyRight, PathfinderSubtract,
        ScaleExpand, FontUnderline, FontBaselineShift, FontAllcaps, LayoutHeader3columns,
        ReflectHorizontal, PathfinderIntersect, BoxOval, FontLeading, AddVectorpoint,
        LayoutSidebarLeft, FontTracking, BoxRectangle, PenRemove, ScaleReduce, Layout2columns,
        Eyedropper, Pages, ParagraphJustifyLeft, Character, ShapeRectangle, BoxPolygon,
        ParagraphJustifyAll, LayoutHeaderSideright, ShapePolygon, SelectionOval, FontSmallcapital,
        SelectionRectangle, HorizontalAlignRight, RemoveVectorpoint, PathfinderUnite,
        SelectionRoundedrectangle, Layers1, FontHorizontalScale, Pen, Layout4columns,
        SelectionPolygon, Pencil, Paintbucket, FontSize, HorizontalDistributeCenter,
        VerticalAlignTop, Layers2, ParagraphSpaceBefore, IndentLeft, FontKerning,
        LayoutHeader4boxes, Paintbrush, VerticalAlignBottom, ShapeRoundedrectangle, ShapeOval,
        Layout3columns, Magnete, LayoutHeaderComplex4, FontSmallcaps, LayoutHeaderSideleft,
        ReflectVertical, Polygonallasso, HorizontalDistributeRight, IndentFirstline,
        FontVerticalScale, Layout, LayoutSidebarRight, VerticalDistributeCenter, TransformBezier,
        LayoutHeaderComplex2, PenAdd, LayoutHeader2columns, Lasso, LayoutHeaderComplex3,
        HorizontalDistributeLeft, FontStrikethrough
    }

    enum class Weather {
        VariableHalfmoon, WindSun, Tempest, WindNe, MistyrainFullmoon, Snowflake,
        SnowHalfmoon, Gemini, DownpourHalfmoon, HailSun, MoonsetHalf, Cloud, WindHalfmoon,
        CloudDrop, DownpourSun, MistyrainSun, WindNw, Aquarius, Newmoon, FogHalfmoon, Sun, Virgo,
        SnowSun, TempestHalfmoon, WindN, Lightning, Wind, Pisces, RainFullmoon, HailHalfmoon,
        MoonsetFull, WaxingGibbous, Sundown, StormHalfmoon, Storm11, WaxingCresent, Snow,
        StormFullmoon, Drop, WindE, Fog, WindSe, WindS, Moon, CloudSnowflake, TempestSun, Capricorn,
        MoondownHalf, HailFullmoon, Sunset, RainHalfmoon, Libra, Aries, Scorpio, Storm32,
        TempestFullmoon, Move2, WindW, WindSw, StormSun, Taurus, FogFullmoon, Star, Hail, Mistyrain,
        Fullmoon, FirstQuarter, MoondownFull, WindFullmoon, Leo, Sagittarius, LastQuarter, FogSun,
        RainSun, DownpourFullmoon, Rain, VariableSun, VariableFullmoon, WaningGibbous, Cancer,
        SnowFullmoon, CloudLightning, MistyrainHalfmoon, WaningCresent, Windgust
    }

    enum class Arrows {
        CircleMinus, SlimDownDashed, LeftDouble32, SlideDown1, Compress, CircleLeft,
        Minus, SquareUpright, Question, MoveBottom, SlideDown2, Info, Horizontal, DownDouble34,
        DragUp, Plus, CircleUpright, DragDownDashed, Hamburger1, SignDown, StretchHorizontal1,
        KeyboardTab, MoveLeft, SignUp, DragDown, CircleDownright, ExpandHorizontal1,
        StretchHorizontal2, Rotate, KeyboardLeft, RotateAntiDashed, Shrink, SquareMinus, Down,
        SquareRight, CircleDownleft, Expand, ClockwiseDashed, SlimRightDashed, SlideLeft1, Squares,
        Exclamation, SlimUpDashed, KeyboardDown28, Move, KeyboardDelete, DragRightDashed, Glide,
        ButtonOff, SquareUpleft, SlideLeft2, CircleUp, SlideRight1, KeyboardCmd29, Vertical,
        CircleUpleft, SwitchVertical, SquareLeft, GlideVertical, SlideRight2, SquareUp, Upright,
        Right, DragUpDashed, KeyboardShift, CircleRight, DragHoriz, SquareDownright, SlimDown,
        Downright, CircleCheck, Deny, FitVertical, ButtonUp, MoveTop, StretchDiagonal3, CirclePlus,
        StretchDiagonal2, RotateAnti, DragLeftDashed, Up, Check, Downleft, Anticlockwise, UpDouble,
        Hamburger2, StretchDiagonal1, ShrinkHorizonal2, RotateDashed, Left, Diagonal, SlimLeft,
        Clockwise, ExpandVertical1, StretchDiagonal4, ButtonOn, SlideUp2, SlimLeftDashed,
        GlideHorizontal, DragRight, ShrinkDiagonal2, ShrinkHorizontal1, Move2, Diagonal2,
        SquareDown, SlideUp1, ShrinkDiagonal1, SquareCheck, Remove, CircleRemove, KeyboardReturn,
        ShrinkVertical1, SlimRight, SignRight, AnticlockwiseDashed, SquareDownleft, CircleDown,
        ShrinkVertical2, MoveRight, FitHorizontal, SlimUp, SwitchHorizontal, ExpandDiagonal1,
        RightDouble31, StretchVertical1, DragVert, KeyboardAlt, SquarePlus, DragLeft, KeyboardRight,
        StretchVertical2, KeyboardUp, SquareRemove, ButtonDown, SignLeft
    }

    enum class BasicElaboration {
        DocumentNext, TodolistPlus, BrowserPlus, MailSearch, DocumentCheck,
        FolderNoaccess, SmartphoneRefresh, MessageNote, FolderRemove, TodolistNoaccess,
        BrowserSearch, FolderDocument, BriefcaseMinus, CloudNoaccess, CalendarDownload,
        SmartphonePicture, DocumentStar, BookmarkPlus, CalendarNoaccess, CalendarRefresh,
        MessagePlus, CloudDownload, BrowserCheck, CalendarNext, CalendarStar, CloudMinus,
        TodolistDownload, BriefcaseStar, CalendarEmpty, FolderUpload, BriefcaseFlagged,
        FolderDownload, TodolistCheck, FolderPicture, BookmarkMinus, MailNext, DocumentPrevious,
        BriefcaseUpload, TodolistSearch, SmartphoneSearch, TabletPencil, BriefcaseDownload,
        MessageHappy, TabletRefresh, MessageCheck, DocumentFlagged, TodolistFlagged, FolderRefresh,
        FolderCloud, TabletPicture, Todolist2, MessageDots, MailHeart, MailStar, BrowserDownload,
        FolderNext, MailPrevious, FolderPencil, CloudSearch, MailFlagged, CalendarSearch,
        CalendarCheck, FolderHeart, DocumentSearch, BriefcaseRemove, FolderMinus, MailCloud,
        FolderStar, SmartphoneNote, FolderGraph, DocumentGraph, MailDocument, DocumentMinus,
        SmartphoneNoaccess, CloudUpload, MailPicture, DocumentDownload, FolderNote, SmartphoneCloud,
        CalendarUpload, DocumentHeart, BriefcaseCheck, DocumentUpload, TodolistRemove, MailNoaccess,
        MailRefresh, MessageRefresh, CloudRefresh, DocumentRemove, TodolistUpload, BriefcaseSearch,
        FolderFlagged, FolderPlus, DocumentPicture, BookmarkChecck, MailNote, SmartphoneHeart,
        BrowserMinus, DocumentCloud, MailDownload, DocumentNoaccess, CloudPlus, CloudCheck,
        CloudRemove, TodolistRefresh, DocumentRefresh, BrowserRefresh, CalendarRemove, TabletNote,
        MailPencil, MessageHeart, BrowserRemove, TodolistMinus, DocumentPlus, MessageMinus,
        TabletCloud, BriefcaseRefresh, DocumentPencil, CalendarPrevious, CalendarPencil, MailRemove,
        TabletNoaccess, MailCheck, CalendarFlagged, CalendarCloud, FolderSearch, TodolistStar,
        BrowserStar, MessageSad, MailUpload, DocumentNote, CalendarPlus, TodolistCloud, TabletHeart,
        BriefcasePlus, CalendarMinus, BrowserUpload, FolderPrevious, TabletSearch, SmartphonePencil,
        FolderCheck, CalendarHeart, BookmarkRemove, MessageRemove, TodolistPencil
    }
}