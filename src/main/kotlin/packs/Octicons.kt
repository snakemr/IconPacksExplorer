package packs

import compose.icons.AllIcons
import compose.icons.Octicons
import compose.icons.octicons.Octoface24

class Octicons {
    companion object : IconPack {
        override val name: String = Octicons::class.simpleName!!
        private val all = "" to Icons.entries
        override val packs = mapOf(all)
        override val icons = Octicons.AllIcons
        override val icon = Octicons.Octoface24
    }

    enum class Icons {
        MultiSelect24, Video24, Telescope16, Megaphone24, Report16, Info16,
        ChevronUp16, Globe24, Mute24, Cpu24, People24, CodeReview24, DiffRemoved16, Hourglass24,
        DeviceCameraVideo16, ListUnordered16, Sun16, KebabHorizontal16, DeviceCamera16, Home16,
        BookmarkSlash24, GitCompare16, Checklist24, Filter24, ListOrdered16, Terminal24, Code24,
        MarkGithub16, ArrowLeft24, Organization16, Octoface24, BellFill24, Archive16,
        IssueReopened24, Ellipsis16, DeviceCameraVideo24, Star16, LogoGithub16, Person16, FoldUp24,
        Gift16, Meter16, Milestone24, HeartFill16, Shield24, GitCommit24, Rocket24, NorthStar24,
        Mention16, Stopwatch24, Share16, Heart24, Thumbsup24, Tasklist16, Bug16, SquareFill16,
        Bell24, ShieldX24, Commit24, Smiley16, Megaphone16, Moon16, Squirrel24, Location24,
        ArrowUpRight24, People16, Sync16, ShieldCheck24, Smiley24, Diff24, Unmute16, Plus16,
        LinkExternal16, Question16, Zap16, Number24, Download24, Question24, Mention24, SignIn24,
        Alert16, KebabHorizontal24, Circle16, ArrowSwitch16, Insights24, Thumbsdown16, Clippy16,
        IssueOpened16, EyeClosed16, EyeClosed24, Verified24, Plus24, FoldDown16, Beaker16,
        FileZip16, Terminal16, ArrowBoth16, RepoClone16, File16, ShieldCheck16, Skip16, RepoPush24,
        Bold24, Dash16, History16, GitPullRequest24, Tab24, Check24, Gear24, Server16,
        IssueOpened24, Number16, Stopwatch16, Sun24, Dash24, Play24, Sync24, ChevronRight24,
        Quote24, Bell16, CrossReference16, Circle24, Workflow16, TriangleRight24, LightBulb24,
        GitCommit16, ScreenFull24, DiffAdded16, Mail16, Moon24, FileCode16, Lock16, Thumbsup16,
        GitMerge16, FileBadge16, Key24, TriangleRight16, GitBranch24, ArrowUp16, Unfold16, Diff16,
        Calendar24, CodeSquare16, Browser16, Container24, Beaker24, MortarBoard24,
        DesktopDownload24, FileSubmodule24, GitBranch16, XCircleFill24, File24, ArrowRight24,
        Plug24, ArrowDown16, CheckCircle16, Rocket16, Mirror24, Reply24, DotFill24, Law16,
        Octoface16, ListOrdered24, Italic24, Heading24, Database24, ThreeBars16, Star24, Alert24,
        Telescope24, CircleSlash16, Server24, XCircle16, GitMerge24, Unverified16, ChevronLeft16,
        PackageDependencies16, TriangleUp24, Project24, LinkExternal24, MortarBoard16, FoldUp16,
        CrossReference24, Briefcase24, TriangleLeft24, Trash16, Grabber24, HeartFill24, Globe16,
        Square16, Strikethrough16, Milestone16, Comment24, Person24, Broadcast16, Checklist16,
        PackageDependencies24, DeviceMobile24, ShieldLock16, FileDirectoryFill24, Image16,
        Versions16, Upload16, FileMedia24, HorizontalRule24, ListUnordered24, Pulse24, Pin24,
        ArrowDownRight24, HomeFill24, Italic16, Video16, Zap24, BellSlash16, Upload24, SignIn16,
        Versions24, GitFork24, Ruby16, Calendar16, PlusCircle24, DotFill16, Image24,
        IssueReopened16, SignOut24, Ruby24, Briefcase16, Report24, Info24, Gear16, Square24,
        Squirrel16, Key16, ShieldLock24, MultiSelect16, PlusCircle16, ScreenNormal24, Infinity24,
        Filter16, Home24, LightBulb16, Mail24, Book16, Law24, DeviceMobile16, Fold24, CodeReview16,
        BookmarkFill24, Repo16, FileSubmodule16, FileSymlinkFile16, Bookmark16, Unlock16,
        Tasklist24, RepoForked16, Infinity16, Package16, Pin16, Inbox24, ArrowDown24,
        DeviceDesktop24, Thumbsdown24, Plug16, FileCode24, Stop24, Pulse16, BellSlash24, Flame24,
        Tools16, Bug24, X24, Dot16, Unmute24, Typography16, Container16, DiffIgnored16,
        CommentDiscussion24, RepoPush16, Typography24, Unverified24, ScreenFull16, Clippy24,
        ArrowDownLeft24, Workflow24, ChevronUp24, FileDiff24, CreditCard24, Fold16, Broadcast24,
        DiffRenamed16, FileZip24, Book24, XCircleFill16, Flame16, Heart16, ArrowUpLeft24, Hubot24,
        Eye16, FoldDown24, Markdown16, Paintbrush16, TriangleDown16, Graph24, Comment16,
        IssueClosed16, Search24, XCircle24, Bookmark24, FileSymlinkFile24, Package24, CheckCircle24,
        HorizontalRule16, Tag24, TriangleLeft16, Share24, Strikethrough24, ArrowBoth24, Lock24,
        Code16, DesktopDownload16, NoEntry24, Pencil24, Link24, ShareAndroid24, Tag16, Hubot16,
        RepoTemplate16, Note24, TriangleDown24, ShieldX16, DeviceDesktop16, ChevronDown24,
        ChevronDown16, RepoTemplate24, Search16, Unlock24, SignOut16, DiffModified16,
        ScreenNormal16, Repo24, Download16, Archive24, BookmarkSlashFill24, FileDirectory24,
        ChevronRight16, Skip24, FileDiff16, Graph16, Play16, Tools24, Copy24, Bold16, Unfold24,
        Rss16, Link16, CircleSlash24, NorthStar16, NoEntry16, Verified16, FileBinary24, ArrowLeft16,
        ShareAndroid16, Pencil16, Grabber16, Shield16, LogoGist16, TriangleUp16, Reply16, X16,
        Project16, SquareFill24, CodeSquare24, GitCompare24, Eye24, Trash24, CreditCard16, Stop16,
        History24, Organization24, StarFill16, ArrowSwitch24, FileBinary16, ArrowUp24, Clock16,
        Gift24, FileDirectory16, PackageDependents16, ChevronLeft24, Mirror16, StarFill24,
        Heading16, Dot24, IssueClosed24, Mute16, Note16, Inbox16, Check16, PaperAirplane16,
        Location16, Clock24, Quote16, CheckCircleFill24, PackageDependents24, ArrowRight16,
        Database16, CommentDiscussion16, Cpu16, Rss24, Hourglass16, RepoPull16, GitPullRequest16,
        BookmarkSlash16, PaperAirplane24, CheckCircleFill16
    }
}