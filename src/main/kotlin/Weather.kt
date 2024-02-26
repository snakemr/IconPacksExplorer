import compose.icons.AllIcons
import compose.icons.WeatherIcons
import compose.icons.weathericons.DayCloudy

class Weather {
    companion object : IconPack {
        override val name: String = WeatherIcons::class.simpleName!!
        private val all = "" to Icons.entries
        override val packs = mapOf(all)
        override val icons = WeatherIcons.AllIcons
        override val icon = WeatherIcons.DayCloudy
    }

    enum class Icons {
        Time11, DayShowers, Train, NightAltShowers, NightAltThunderstorm,
        NightRainMix, DayRainMix, NightAltRainWind, MoonAltWaningCrescent5, WindBeaufort11, Time7,
        Smog, NightClear, DirectionDownLeft, Sandstorm, CloudyGusts, MoonAltNew, NightAltCloudy,
        LunarEclipse, Lightning, WindDeg, MoonAltWaningGibbous5, Fog, NightCloudy,
        NightThunderstorm, RainWind, MoonAltWaningGibbous6, CloudDown, MoonWaningCrescent6,
        MoonWaxingCrescent6, MoonAltWaningGibbous4, MoonWaningGibbous6, MoonWaxingCrescent2,
        WindBeaufort5, Refresh, DaySnowWind, DayCloudyWindy, MoonWaxingGibbous6, Alien,
        MoonThirdQuarter, MoonAltWaxingGibbous1, NightStormShowers, Horizon, ThermometerInternal,
        HorizonAlt, WindBeaufort1, MoonAltWaxingCrescent4, DayFog, DayStormShowers, NightHail,
        DaySprinkle, WindBeaufort9, WindBeaufort2, MoonAltWaxingCrescent2, MoonWaningCrescent2,
        DayHaze, HurricaneWarning, Earthquake, DaySleet, DaySleetStorm, DayRainWind,
        DirectionUpLeft, CloudUp, Raindrops, Hot, MoonAltWaningGibbous3, MoonAltThirdQuarter,
        DaySunnyOvercast, Sunrise, NightAltSleet, NightSnowWind, MoonAltWaxingGibbous5, Celsius,
        NightAltRain, MoonWaxingGibbous2, WindBeaufort10, MoonAltWaningCrescent2,
        MoonWaxingGibbous3, MoonAltWaxingCrescent1, StormWarning, NightShowers, Windy,
        MoonAltWaxingCrescent3, Barometer, MoonAltWaningGibbous1, NightCloudyGusts, DayHail,
        DirectionDown, MoonAltWaxingGibbous4, Volcano, MoonWaningGibbous2, DirectionRight,
        WindBeaufort7, NightAltSnowThunderstorm, MoonWaxingGibbous5, WindBeaufort12, Stars,
        SolarEclipse, MoonFirstQuarter, MoonWaningGibbous4, DaySnowThunderstorm, WindBeaufort6,
        MoonAltWaxingCrescent6, Rain, Hurricane, Hail, SnowWind, Time12, Time4, Time1,
        WindBeaufort0, DayRain, MoonWaxingCrescent3, MoonAltWaningCrescent6, MoonWaxingGibbous1,
        MoonWaxingCrescent5, StormShowers, Thunderstorm, Time9, MoonAltWaningCrescent4, Sunset,
        Sleet, RainMix, NightCloudyHigh, MoonWaxingCrescent1, NightSprinkle, StrongWind, Cloudy,
        MoonNew, SnowflakeCold, WindBeaufort8, NightSnowThunderstorm, WindBeaufort3,
        MoonWaxingCrescent4, DirectionDownRight, MoonWaningCrescent4, Thermometer,
        MoonAltWaxingGibbous2, Fahrenheit, Sprinkle, NightAltLightning, DayLightWind, NightRain,
        NightAltSprinkle, NightFog, Moonset, NightRainWind, Umbrella, NightAltStormShowers,
        RefreshAlt, WindBeaufort4, CloudyWindy, Time5, DayCloudy, MoonWaningCrescent1,
        MoonAltFirstQuarter, Humidity, Na, Moonrise, MoonAltWaningCrescent1, MoonFull,
        SmallCraftAdvisory, DayCloudyGusts, DirectionUp, MoonAltWaxingGibbous6, NightAltRainMix,
        DirectionUpRight, NightAltHail, DaySnow, MoonWaningGibbous1, NightAltCloudyHigh, Dust,
        Time3, MoonWaningCrescent5, ThermometerExterior, DayLightning, DayCloudyHigh,
        NightAltCloudyGusts, Raindrop, MoonAltWaningCrescent3, NightPartlyCloudy, MoonAltFull,
        NightAltCloudyWindy, Fire, Meteor, Time6, Showers, MoonWaningGibbous3, MoonWaningGibbous5,
        Smoke, NightSnow, Tornado, DayWindy, MoonAltWaningGibbous2, NightAltPartlyCloudy,
        MoonAltWaxingGibbous3, Snow, Flood, NightSleetStorm, NightSleet, DaySunny, NightCloudyWindy,
        MoonAltWaxingCrescent5, DirectionLeft, Degrees, Time10, CloudRefresh, DayThunderstorm,
        Tsunami, NightLightning, MoonWaxingGibbous4, Time2, NightAltSnow, NightAltSnowWind,
        GaleWarning, Cloud, Time8, MoonWaningCrescent3, NightAltSleetStorm
    }
}