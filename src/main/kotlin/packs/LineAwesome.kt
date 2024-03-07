package packs

import compose.icons.AllIcons
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.FontAwesomeFlag

class LineAwesome {
    companion object : IconPack {
        override val name: String = LineAwesomeIcons::class.simpleName!!
        private val all = "" to Icons.entries
        override val packs = mapOf(all)
        override val icons = LineAwesomeIcons.AllIcons
        override val icon = LineAwesomeIcons.FontAwesomeFlag
    }

    enum class Icons {
        CookieBiteSolid, PlayCircle, WordpressSimple, StoreAltSolid, Dizzy,
        JournalWhillsSolid, BookDeadSolid, PhotoVideoSolid, HippoSolid, CalendarCheckSolid,
        BikingSolid, ArrowAltCircleRightSolid, Buffer, Cloudsmith, Viadeo, HandPointDownSolid,
        HospitalSolid, StackOverflow, CalendarPlusSolid, IceCreamSolid, SuperscriptSolid, MehBlank,
        FrownOpenSolid, CampgroundSolid, MenorahSolid, EyeSlashSolid, SignSolid, BatteryEmptySolid,
        Python, SortNumericUpAltSolid, FileAudioSolid, SeedlingSolid, UniversitySolid, Dochub,
        Ember, LongArrowAltLeftSolid, Discord, FeatherSolid, TrashSolid, PasteSolid, CoinsSolid,
        UserNurseSolid, CloudSolid, Grin, SortDownSolid, LaptopMedicalSolid, FileArchive,
        BusAltSolid, YoutubeSquare, HikingSolid, Odnoklassniki, TheaterMasksSolid, Deskpro,
        CloudMoonRainSolid, SkullSolid, ParkingSolid, RepublicanSolid, ToggleOffSolid,
        CreativeCommonsNd, BullseyeSolid, FaxSolid, SortAlphaUpAltSolid, WindowMinimizeSolid,
        Sellsy, MoneyBillWaveSolid, BinocularsSolid, RulerCombinedSolid, GrinTongueSquint,
        DungeonSolid, TintSolid, ThermometerFullSolid, Hotjar, Scribd, DumpsterSolid, Mandalorian,
        PauseSolid, ExternalLinkAltSolid, PenSolid, DiceSixSolid, SpaceShuttleSolid,
        HouseDamageSolid, SignalSolid, KissBeam, GoogleDrive, NewspaperSolid,
        ExclamationTriangleSolid, CloudShowersHeavySolid, CarSolid, Skype, Digg, Jenkins,
        CarCrashSolid, PeaceSolid, BaseballBallSolid, PlusSquareSolid, Osi, MinusCircleSolid,
        Tumblr, FolderPlusSolid, ReceiptSolid, Bitcoin, GolfBallSolid, UnderlineSolid,
        PepperHotSolid, HandPaperSolid, VideoSlashSolid, HourglassSolid, FacebookSquare,
        SignOutAltSolid, PiggyBankSolid, FirstOrderAlt, ToggleOnSolid, Shopware, DrumSolid,
        Artstation, AirFreshenerSolid, HandsHelpingSolid, TagsSolid, FacebookF, GgCircle,
        CartPlusSolid, CcDiscover, EllipsisVSolid, SaveSolid, HotelSolid, TruckLoadingSolid,
        HandPeace, SlashSolid, ChartPieSolid, MusicSolid, Studiovinari, Dropbox,
        EnvelopeSquareSolid, UnlockAltSolid, StepForwardSolid, GrinTearsSolid, Airbnb, MedkitSolid,
        Megaport, LaptopSolid, NotesMedicalSolid, AssistiveListeningSystemsSolid, Affiliatetheme,
        Hackerrank, Sass, FileInvoiceDollarSolid, RobotSolid, SpiderSolid, Wpressr, ShekelSignSolid,
        JediOrder, UsersCogSolid, HackerNewsSquare, YinYangSolid, SuitcaseSolid, GitAlt, FileCode,
        DogSolid, SignatureSolid, HandHoldingHeartSolid, HandPeaceSolid, Superpowers, VialSolid,
        PhoneSquareAltSolid, Squarespace, BattleNet, BiohazardSolid, Microsoft, ShareSquareSolid,
        Angry, TrashAltSolid, ThumbsDown, BrainSolid, GooglePlusSquare, ViadeoSquare, SprayCanSolid,
        BrushSolid, CcPaypal, ChessBoardSolid, ChessRookSolid, SpeakerDeck, Atlassian,
        UmbrellaBeachSolid, CogsSolid, SimCardSolid, CaretSquareLeftSolid, CommentDots, Reacteurope,
        UnlockSolid, DeafSolid, YandexInternational, CitySolid, PlusSolid, ArrowDownSolid, Amazon,
        CubeSolid, Hdd, Snowflake, CubesSolid, GopuramSolid, GrinTongueSolid, BuyNLarge,
        BorderStyleSolid, ChalkboardTeacherSolid, TrademarkSolid, Dev, ClosedCaptioningSolid,
        WaveSquareSolid, UserCogSolid, VimeoSquare, SyringeSolid, CarBatterySolid, FileAlt,
        PhoneAltSolid, SlackHash, StarSolid, FacebookMessenger, Earlybirds, Npm, HeartbeatSolid,
        HandPaper, Asymmetrik, BriefcaseSolid, CrosshairsSolid, LaughSquint, Circle,
        StopCircleSolid, DiceThreeSolid, RunningSolid, TransgenderAltSolid, Leanpub, HandLizard,
        FileCodeSolid, ArrowUpSolid, CheckDoubleSolid, Mastodon, SunSolid, SortSolid, EqualsSolid,
        SquareRootAltSolid, AdSolid, BookOpenSolid, CaretSquareDownSolid, ScrollSolid, StoreSolid,
        ChevronLeftSolid, TasksSolid, CcAmex, RulerSolid, ProceduresSolid, Researchgate,
        KissBeamSolid, BugSolid, GrinHearts, CarrotSolid, GrinSquintTears, NetworkWiredSolid,
        HorseSolid, LessThanSolid, Forumbee, StopSolid, AngleDoubleUpSolid, InfinitySolid, Xbox,
        Quora, DollyFlatbedSolid, AsteriskSolid, MoonSolid, Registered, DAndD, HeadsetSolid, Gitlab,
        CalendarSolid, Spotify, Etsy, CashRegisterSolid, BusSolid, VolumeMuteSolid, BoldSolid,
        UserAltSolid, HackerNews, DnaSolid, Lemon, BellSlash, StampSolid, FileWord,
        HospitalAltSolid, BorderAllSolid, PagerSolid, CapsulesSolid, Weixin, SearchLocationSolid,
        AngleDoubleLeftSolid, BibleSolid, PeopleCarrySolid, UnlinkSolid, CaretSquareUp, Imdb,
        PinterestP, Ioxhost, AngleDoubleRightSolid, BezierCurveSolid, WindowCloseSolid,
        UserTimesSolid, ProjectDiagramSolid, ClipboardCheckSolid, MonumentSolid, Phabricator,
        TableSolid, EnvelopeOpenTextSolid, BurnSolid, FileSolid, OdnoklassnikiSquare,
        GrinHeartsSolid, DemocratSolid, LaughSolid, Rev, ToriiGateSolid, Moon, MagicSolid,
        MicrochipSolid, MapMarkerSolid, ChartBar, PassportSolid, UserCircleSolid, Ebay, PlaySolid,
        Searchengin, BalanceScaleSolid, ICursorSolid, EnvelopeSolid, Btc, Clock, AtlasSolid, Opera,
        MoneyBillWaveAltSolid, FileVideoSolid, Wpbeginner, StreetViewSolid, Sith, FreeCodeCamp,
        HddSolid, Simplybuilt, CaretUpSolid, CommentSolid, FileExcelSolid, TumblrSquare, MinusSolid,
        Edge, ExchangeAltSolid, GrinStarsSolid, ServerSolid, EraserSolid, CheckCircleSolid,
        VenusSolid, Firefox, VimeoV, BaconSolid, Amilia, Sourcetree, DribbbleSquare, Mizuni,
        HamsaSolid, MinusSquareSolid, CheckSolid, PaperPlaneSolid, Vine, CannabisSolid, Houzz,
        SmileSolid, FileImage, Usb, SwatchbookSolid, Laravel, ExclamationCircleSolid,
        GrinTongueSquintSolid, ChargingStationSolid, PoundSignSolid, ArrowAltCircleUp,
        FontAwesomeFlag, Ubuntu, ListOlSolid, GrinWink, OmSolid, ArrowLeftSolid,
        DigitalTachographSolid, BatteryThreeQuartersSolid, AudioDescriptionSolid,
        ThermometerThreeQuartersSolid, ShareSolid, GlassesSolid, Deviantart, WindowClose, Dyalog,
        CloudSunRainSolid, DraftingCompassSolid, Weibo, RocketSolid, CloudSunSolid, ProductHunt,
        IdBadgeSolid, TractorSolid, BasketballBallSolid, GenderlessSolid, EllipsisHSolid,
        WolfPackBattalion, PlaceOfWorshipSolid, CaretLeftSolid, BandAidSolid, DoorClosedSolid,
        Supple, Themeco, MapSignsSolid, DrumSteelpanSolid, AddressCardSolid, FastBackwardSolid,
        JsSquare, HeadphonesAltSolid, StopCircle, ShoppingBasketSolid, Teamspeak,
        RulerVerticalSolid, InfoSolid, HomeSolid, Css3, SleighSolid, PalletSolid, HaykalSolid,
        SortNumericDownSolid, HandPointUp, Gitkraken, QuestionCircle, Neos, RestroomSolid,
        LemonSolid, CheckSquare, Reddit, Intercom, LifeRingSolid, Yandex, ChairSolid, DownloadSolid,
        CutSolid, Gitter, ChalkboardSolid, Wpforms, HourglassHalfSolid, CalendarCheck,
        KissWinkHeartSolid, TruckMonsterSolid, FingerprintSolid, RecycleSolid, MehSolid, GrinSolid,
        Flag, ChartBarSolid, RibbonSolid, PooStormSolid, ObjectUngroup, WindowMinimize,
        HamburgerSolid, ChartAreaSolid, AppleAltSolid, AtomSolid, Google, GetPocket,
        PaintBrushSolid, PoopSolid, FanSolid, Clone, Rocketchat, StackExchange, ShuttleVanSolid,
        WalkingSolid, UserShieldSolid, CloudMoonSolid, Bootstrap, VenusDoubleSolid, Gulp, Envelope,
        SnapchatGhost, Mdb, MoneyCheckAltSolid, HandLizardSolid, SwimmingPoolSolid, Grunt,
        Stumbleupon, MousePointerSolid, OptinMonster, FutbolSolid, FastForwardSolid, CriticalRole,
        Expeditedssl, AlignCenterSolid, TabletsSolid, Hubspot, FilePowerpoint, DizzySolid,
        FileAltSolid, WeightHangingSolid, HelicopterSolid, AngleRightSolid, ArrowAltCircleUpSolid,
        FolderOpenSolid, GlobeSolid, LocationArrowSolid, MemorySolid, FileImageSolid, Blackberry,
        TabletAltSolid, KhandaSolid, PollHSolid, MediumM, Edit, FemaleSolid, GlobeAsiaSolid,
        Symfony, PizzaSliceSolid, CameraSolid, LifeRing, MaskSolid, CcJcb, CreativeCommonsPd,
        FunnelDollarSolid, GuitarSolid, Comments, ThumbsUpSolid, CaretSquareLeft, Evernote,
        PrescriptionSolid, LayerGroupSolid, AnchorSolid, WindowRestoreSolid, BehanceSquare,
        HandRock, CcMastercard, Handshake, BlogSolid, SnowflakeSolid, UserMdSolid, FlaskSolid,
        GlassMartiniAltSolid, MicrophoneAltSlashSolid, ArrowsAltVSolid, ExpandSolid, Accusoft,
        Envira, SuitcaseRollingSolid, BlindSolid, CrossSolid, ShapesSolid, SortAlphaUpSolid,
        Soundcloud, StickyNoteSolid, HorseHeadSolid, Invision, FlagCheckeredSolid,
        BatteryQuarterSolid, SortAmountUpSolid, TruckMovingSolid, ChessSolid, Codepen, ToothSolid,
        CommentAlt, RedoAltSolid, ReplyAllSolid, Uber, LiraSignSolid, Eye, ItalicSolid,
        FileContractSolid, CaretDownSolid, MehRollingEyesSolid, TintSlashSolid, WikipediaW,
        CheeseSolid, GitSquare, KeyboardSolid, TencentWeibo, Yoast, Images, AngleDownSolid,
        MapPinSolid, UserEditSolid, ChevronCircleDownSolid, Line, RetweetSolid, Snapchat,
        CropAltSolid, SkiingSolid, CommentMedicalSolid, TransgenderSolid, TableTennisSolid,
        LastfmSquare, Sun, DirectionsSolid, TeethOpenSolid, ThumbtackSolid, ThermometerHalfSolid,
        HockeyPuckSolid, Mix, SortAlphaDownAltSolid, CommentSlashSolid, MittenSolid,
        UserAstronautSolid, Erlang, HatCowboySideSolid, Adversal, PortraitSolid, AlignLeftSolid,
        LanguageSolid, GrinTears, Ns8, UserPlusSolid, AccessibleIcon, Themeisle, DiceTwoSolid,
        FootballBallSolid, HandScissors, LaptopCodeSolid, FileCsvSolid, ChevronCircleRightSolid,
        CogSolid, MicroscopeSolid, EyeSlash, ShipSolid, SadCry, Speakap, RoadSolid, CompressSolid,
        UtensilsSolid, CropSolid, TruckSolid, Sellcast, Adobe, HanukiahSolid, SadTearSolid,
        EditSolid, Dribbble, Yarn, MailBulkSolid, GooglePlay, HandPointRightSolid, XingSquare,
        LongArrowAltRightSolid, Empire, PlaneDepartureSolid, ThermometerSolid, ShareAltSquareSolid,
        LaughWink, AmazonPay, Mixcloud, BalanceScaleRightSolid, QuidditchSolid, FeatherAltSolid,
        ParagraphSolid, MicrophoneAltSolid, GlideG, SplotchSolid, Swift, QuoteRightSolid,
        MedalSolid, MagnetSolid, UserCheckSolid, DiceFiveSolid, ApplePay, RubleSignSolid,
        LinkedinIn, MapMarkedAltSolid, WheelchairSolid, GrinSquintSolid, GithubSquare, GemSolid,
        Periscope, AddressCard, MinusSquare, FortAwesomeAlt, VoteYeaSolid, TrashRestoreSolid,
        SolarPanelSolid, Discourse, UtensilSpoonSolid, TachometerAltSolid, Nutritionix, Css3Alt,
        GithubAlt, AngleDoubleDownSolid, ExclamationSolid, Draft2digital, SmileBeam,
        ShoppingBagSolid, MoneyBillAlt, Viber, Kickstarter, NeuterSolid, DiceFourSolid, Meetup,
        ShareSquare, Whatsapp, Palfed, CrownSolid, WifiSolid, ObjectGroup, HandshakeSolid,
        SortAlphaDownSolid, HeartSolid, UserSecretSolid, CalendarAltSolid, Ussunnah,
        VolleyballBallSolid, CottonBureau, Aws, KissWinkHeart, CopyrightSolid, SocksSolid,
        GiftsSolid, GrinTongue, PrayingHandsSolid, DotCircle, VialsSolid, RouteSolid, SnowplowSolid,
        ShowerSolid, BreadSliceSolid, RedditAlien, GalacticSenate, RProject, CreativeCommonsPdAlt,
        Image, DiceSolid, LightbulbSolid, Cpanel, Windows, FileDownloadSolid, SpaSolid,
        SurpriseSolid, UserGraduateSolid, Bitbucket, Zhihu, ThSolid, BatteryHalfSolid, Suse,
        Angrycreative, TrophySolid, CcAmazonPay, PhoenixSquadron, DumpsterFireSolid, PodcastSolid,
        CatSolid, MarsSolid, TeethSolid, Php, DrawPolygonSolid, PhoneSolid, SdCardSolid,
        ArrowCircleDownSolid, BookReaderSolid, Whmcs, DrumstickBiteSolid, Frown, CompassSolid,
        SortAmountDownAltSolid, HashtagSolid, FolderMinusSolid, RainbowSolid, PauseCircle,
        HandPointerSolid, SortNumericDownAltSolid, ChevronCircleUpSolid, HeartBrokenSolid,
        IciclesSolid, Monero, Keybase, CouchSolid, FileInvoiceSolid, Salesforce, Lastfm, Clipboard,
        Patreon, StopwatchSolid, EggSolid, ArrowsAltHSolid, SynagogueSolid, SmogSolid, DigitalOcean,
        RaspberryPi, File, AngleLeftSolid, TradeFederation, FlushedSolid, ArrowAltCircleDownSolid,
        Fulcrum, Orcid, CreativeCommonsZero, GrinStars, MoneyCheckSolid, Servicestack, Diaspora,
        Android, TruckPickupSolid, AlignRightSolid, Hourglass, Grav, Openid, ClockSolid,
        MapMarkerAltSolid, VoicemailSolid, Java, Slideshare, Building, BabySolid, Waze, TengeSolid,
        EnvelopeOpen, Schlix, ClosedCaptioning, CcDinersClub, CookieSolid, TelegramPlane,
        StrikethroughSolid, OutdentSolid, UserCircle, Lyft, Medium, ChessPawnSolid,
        SkullCrossbonesSolid, CalendarMinus, RedoSolid, UserInjuredSolid, BeerSolid,
        BalanceScaleLeftSolid, Glide, VectorSquareSolid, CoffeeSolid, GripVerticalSolid,
        UserTagSolid, MosqueSolid, Telegram, VolumeUpSolid, CalendarMinusSolid, ClipboardListSolid,
        Apper, SubscriptSolid, FortAwesome, FireSolid, MarkerSolid, SteamSquare, GooglePlus,
        AddressBook, Smile, MicrophoneSolid, Goodreads, ArrowCircleLeftSolid, Nimblr,
        MarsStrokeVSolid, IglooSolid, DAndDBeyond, StarHalfAltSolid, Quinscape, MercurySolid,
        Untappd, BlenderPhoneSolid, PennyArcade, RemoveFormatSolid, ChessBishopSolid, JointSolid,
        GiftSolid, PersonBoothSolid, HandPointUpSolid, DharmachakraSolid, HourglassStartSolid, Hips,
        Fly, Html5, AngleUpSolid, WindowMaximizeSolid, UndoSolid, BatteryFullSolid, ToiletSolid,
        Steam, Save, GlassWhiskeySolid, Vimeo, AppStore, GreaterThanEqualSolid, Weebly, Cloudscale,
        CreditCardSolid, Foursquare, SadCrySolid, FistRaisedSolid, Slack, HandPointDown, TimesSolid,
        HandMiddleFingerSolid, HandPointLeftSolid, SatelliteSolid, BabyCarriageSolid,
        LowVisionSolid, CalendarTimesSolid, Freebsd, Copyright, LevelDownAltSolid, PillsSolid,
        XRaySolid, MehRollingEyes, ArrowRightSolid, StarOfDavidSolid, GrinBeamSweatSolid,
        Buysellads, Jsfiddle, WineBottleSolid, HandRockSolid, BookSolid, RingSolid, LevelUpAltSolid,
        DoveSolid, Ravelry, Renren, ArrowAltCircleLeftSolid, ChevronDownSolid, CarAltSolid, SadTear,
        Paypal, Firstdraft, DollySolid, SwimmerSolid, PollSolid, PlusSquare, SchoolSolid,
        SubwaySolid, Copy, VideoSolid, ForwardSolid, CompressArrowsAltSolid, FishSolid, AdjustSolid,
        AwardSolid, UmbrellaSolid, GrinAlt, StreamSolid, SquareSolid, ArrowAltCircleDown,
        PowerOffSolid, NodeJs, HardHatSolid, FileArchiveSolid, UserNinjaSolid, UniversalAccessSolid,
        Fonticons, CaretSquareRightSolid, GripLinesSolid, Grimace, WonSignSolid, Typo3, Replyd,
        CreativeCommonsNcEu, Staylinked, Futbol, HandHoldingUsdSolid, EuroSignSolid, HandSpock,
        Calendar, UndoAltSolid, ListAlt, Uniregistry, IdCardSolid, PinterestSquare, FilePdf,
        TtySolid, GrimaceSolid, Lightbulb, PlaneArrivalSolid, TrashRestoreAltSolid, Itunes,
        TramSolid, CcVisa, Yelp, CreativeCommonsSa, BoxSolid, CompactDiscSolid, FantasyFlightGames,
        BuildingSolid, DiagnosesSolid, SteamSymbol, Angular, Linux, LongArrowAltDownSolid,
        FolderOpen, Umbraco, BoltSolid, FontAwesome, QuestionCircleSolid, HandScissorsSolid,
        EthernetSolid, PraySolid, IdCard, Drupal, SnowboardingSolid, PlayCircleSolid,
        FileUploadSolid, PiedPiperPp, MoneyBillSolid, MobileAltSolid, SmileWink, Apple, Deploydog,
        InfoCircleSolid, Trello, PlusCircleSolid, PastafarianismSolid, TextHeightSolid,
        AllergiesSolid, Vk, BarcodeSolid, PiedPiperAlt, PhoneSlashSolid, WineGlassAltSolid,
        ShieldAltSolid, BoxOpenSolid, React, Folder, BellSolid, Linkedin, Gg, WineGlassSolid,
        RecordVinylSolid, GavelSolid, StarHalfSolid, Bluetooth, MarsDoubleSolid, Bookmark,
        HatWizardSolid, Fedora, NotEqualSolid, Twitter, Adn, KeySolid, GraduationCapSolid,
        ExpandArrowsAltSolid, PooSolid, FirstOrder, Pinterest, SpinnerSolid, Audible, QuranSolid,
        AlignJustifySolid, Vuejs, SkiingNordicSolid, DivideSolid, VolumeOffSolid, SitemapSolid,
        SmokingSolid, ConciergeBellSolid, Cloudversify, FileExportSolid, BirthdayCakeSolid,
        SearchSolid, SortAmountUpAltSolid, PencilRulerSolid, DotCircleSolid, Hospital,
        QuestionSolid, Hornbill, BowlingBallSolid, PenNibSolid, Cuttlefish, ArrowCircleUpSolid,
        HammerSolid, TerminalSolid, FirstAidSolid, BackspaceSolid, LockSolid, SyncAltSolid,
        MicrophoneSlashSolid, GlassMartiniSolid, Comment, CreativeCommons, MarsStrokeSolid, Bity,
        BluetoothB, Medrt, PencilAltSolid, SortAmountDownSolid, PrescriptionBottleSolid,
        ListUlSolid, DragonSolid, Jira, MobileSolid, Kiss, Resolving, StickyNote,
        CreativeCommonsSamplingPlus, BellSlashSolid, BullhornSolid, Bimobject, RedRiver, Ups,
        CaretRightSolid, RadiationAltSolid, SearchMinusSolid, GripLinesVerticalSolid, Pagelines,
        Safari, MapMarkedSolid, Meh, CommentsDollarSolid, ChartLineSolid, MaleSolid, ListAltSolid,
        StarHalf, Figma, Medapps, LaughBeamSolid, ObjectUngroupSolid, HospitalSymbolSolid,
        TshirtSolid, SearchPlusSolid, CreativeCommonsNc, ArrowAltCircleRight, CloudRainSolid, Node,
        Youtube, Mendeley, CopySolid, EyeDropperSolid, GlobeEuropeSolid, GrinTongueWinkSolid,
        PaperPlane, FrownSolid, CircleSolid, CaretSquareDown, SmileWinkSolid, SatelliteDishSolid,
        Modx, ChessKingSolid, InternetExplorer, FireExtinguisherSolid, TagSolid, StroopwafelSolid,
        FileWordSolid, SmsSolid, PaperclipSolid, ImagesSolid, FonticonsFi, Dhl, VenusMarsSolid,
        BorderNoneSolid, Viacoin, Readme, SnowmanSolid, FileMedicalSolid, CreativeCommonsSampling,
        PaletteSolid, CloudDownloadAltSolid, RssSolid, CalendarAlt, Keyboard, _500px,
        UserAltSlashSolid, Opencart, InboxSolid, CanadianMapleLeaf, HSquareSolid, CloneSolid,
        CreativeCommonsBy, ArrowAltCircleLeft, AcquisitionsIncorporated, BloggerB, RegisteredSolid,
        TicketAltSolid, GlobeAmericasSolid, Flickr, Laugh, Twitch, Blogger, Skyatlas, Maxcdn,
        FontSolid, StarAndCrescentSolid, Rebel, WrenchSolid, UserFriendsSolid, PercentSolid,
        FileAudio, GoodreadsG, ClinicMedicalSolid, PercentageSolid, UploadSolid, DonateSolid,
        Keycdn, HotTubSolid, Pushed, Centercode, Map, Yammer, Facebook, Square, HryvniaSolid,
        Autoprefixer, Stackpath, LaughSquintSolid, CameraRetroSolid, UserLockSolid,
        CheckSquareSolid, GrinAltSolid, Aviato, TreeSolid, TvSolid, ToolsSolid, GrinBeamSolid,
        FighterJetSolid, WindSolid, GasPumpSolid, RedditSquare, CcApplePay, KaabaSolid,
        CalendarWeekSolid, FilmSolid, HandsSolid, FlagUsaSolid, Fedex, Tripadvisor, PiedPiper,
        ColumnsSolid, Centos, BombSolid, GlassCheersSolid, CarSideSolid, LinkSolid, CandyCaneSolid,
        MehBlankSolid, CommentDotsSolid, Qq, Docker, StethoscopeSolid, Vaadin, CalendarPlus,
        TemperatureLowSolid, ExternalLinkSquareAltSolid, Star, WalletSolid, OtterSolid,
        WindowRestore, TaxiSolid, CaretSquareUpSolid, MeteorSolid, ArrowCircleRightSolid,
        MugHotSolid, SnapchatSquare, Js, GrinBeam, WindowMaximize, BroadcastTowerSolid,
        FillDripSolid, JediSolid, CloudUploadAltSolid, CocktailSolid, Bandcamp, VrCardboardSolid,
        TheRedYeti, Playstation, ShippingFastSolid, UserSlashSolid, ListSolid, FileExcel,
        GoogleWallet, ChessQueenSolid, Yahoo, TrafficLightSolid, MouseSolid, KissSolid,
        CreativeCommonsRemix, CheckCircle, FrownOpen, GooglePlusG, WhatsappSquare, ArrowsAltSolid,
        PenSquareSolid, CaretSquareRight, ChildSolid, SignLanguageSolid, FilterSolid, WaterSolid,
        CalculatorSolid, PaintRollerSolid, GrinWinkSolid, TiredSolid, StumbleuponCircle, BlackTie,
        ShareAltSolid, Vnv, AmbulanceSolid, MortarPestleSolid, StarOfLifeSolid, WarehouseSolid,
        MapSolid, YenSignSolid, OilCanSolid, Codiepie, Behance, HandPointer, Sketch,
        CloudMeatballSolid, DesktopSolid, HourglassEndSolid, PauseCircleSolid, BoneSolid,
        VolumeDownSolid, CodeSolid, DiceD6Solid, PlaneSolid, Joget, ObjectGroupSolid, FrogSolid,
        ImageSolid, Contao, CrowSolid, Tired, PhoneSquareSolid, UserTieSolid, EnvelopeOpenSolid,
        Usps, PawSolid, ThumbsUp, EyeSolid, ItunesNote, Shirtsinbulk, FilePdfSolid,
        CreativeCommonsShare, GrinSquintTearsSolid, SkatingSolid, FlagSolid, FileImportSolid,
        CalendarDaySolid, SortNumericUpSolid, WizardsOfTheCoast, DumbbellSolid, HandHoldingSolid,
        ChevronCircleLeftSolid, FileMedicalAltSolid, LandmarkSolid, ScrewdriverSolid,
        ChevronRightSolid, ChurchSolid, ViharaSolid, Kaggle, SpellCheckSolid, TwitterSquare,
        ThListSolid, BriefcaseMedicalSolid, RupeeSignSolid, LuggageCartSolid, HandSpockSolid, Page4,
        Compass, PenAltSolid, PlugSolid, QrcodeSolid, StepBackwardSolid, BongSolid, TimesCircle,
        AnkhSolid, Chrome, ShoePrintsSolid, MoneyBillAltSolid, RulerHorizontalSolid, SmileBeamSolid,
        Stripe, SignInAltSolid, DiceOneSolid, GreaterThanSolid, Instagram, GrinBeamSweat, Linode,
        Wordpress, HandPointLeft, AngrySolid, HireAHelper, CartArrowDownSolid, ClipboardSolid,
        CcStripe, ArchwaySolid, LaughWinkSolid, CodeBranchSolid, FileVideo, MotorcycleSolid,
        GalacticRepublic, LongArrowAltUpSolid, PhoneVolumeSolid, TemperatureHighSolid,
        CommentDollarSolid, BroomSolid, Angellist, CertificateSolid, ThinkPeaks, BathSolid,
        FireAltSolid, IndentSolid, Gem, SlidersHSolid, SearchDollarSolid, DatabaseSolid, Wix,
        ShoppingCartSolid, ThermometerEmptySolid, EjectSolid, Joomla, StripeS, Wpexplorer,
        ArchiveSolid, GripHorizontalSolid, IconsSolid, Elementor, TapeSolid, LeafSolid, LaughBeam,
        BusinessTimeSolid, Uikit, DiceD20Solid, Confluence, PrescriptionBottleAltSolid,
        FilePowerpointSolid, Gratipay, GlobeAfricaSolid, CreditCard, CreativeCommonsNcJp,
        BackwardSolid, HandPointRight, Surprise, Strava, FolderSolid, MarsStrokeHSolid,
        DoorOpenSolid, YCombinator, MountainSolid, LockOpenSolid, CommentAltSolid, GhostSolid,
        ParachuteBoxSolid, AmericanSignLanguageInterpretingSolid, FontAwesomeAlt, HighlighterSolid,
        DollarSignSolid, SortUpSolid, PiedPiperHat, SmokingBanSolid, ToiletPaperSolid, UserSolid,
        Algolia, PuzzlePieceSolid, Napster, HeadphonesSolid, Chromecast, IdCardAltSolid, Newspaper,
        AddressBookSolid, ItchIo, RadiationSolid, ThLargeSolid, UserClockSolid, CalendarTimes,
        FileSignatureSolid, Dashcube, Flushed, TextWidthSolid, RandomSolid, IdBadge, HatCowboySolid,
        Buromobelexperte, BicycleSolid, HistorySolid, ThermometerQuarterSolid, ReplySolid,
        HeadingSolid, Git, Magento, Less, AtSolid, HotdogSolid, SquareFullSolid, FillSolid,
        TrainSolid, UserMinusSolid, KickstarterK, BarsSolid, Ethereum, Heart, PhoenixFramework,
        BookmarkSolid, Rockrms, Korvue, Bell, Github, TrashAlt, BlenderSolid, GamepadSolid, Gofore,
        BanSolid, UsersSolid, ThumbsDownSolid, Xing, Ello, PrintSolid, IndustrySolid, WeightSolid,
        OldRepublic, Redhat, PenFancySolid, Sistrix, Delicious, TabletSolid, StickerMule,
        ChessKnightSolid, TorahSolid, Hooli, GrinTongueWink, Gripfire, CircleNotchSolid, Mailchimp,
        TimesCircleSolid, Alipay, SyncSolid, Avianex, GrinSquint, BookMedicalSolid, BoxesSolid,
        RssSquareSolid, CrutchSolid, QuoteLeftSolid, AppStoreIos, KiwiBirdSolid, Markdown,
        HollyBerrySolid, ToolboxSolid, Connectdevelop, FilePrescriptionSolid, LessThanEqualSolid,
        Flipboard, BrailleSolid, CommentsSolid, BedSolid, User, ChevronUpSolid
    }
}