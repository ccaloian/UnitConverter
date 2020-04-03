package converter

import java.util.*

fun decimalPart(num: Double): Double {
    return num - num.toInt()
}

enum class Weight(val repr: String, private val grams: Double, private val singular: String, val plural: String) {
    G("g", 1.0, "gram", "grams"),
    GRAM("gram", 1.0, "gram", "grams"),
    GRAMS("grams", 1.0, "gram", "grams"),
    KG("kg", 1000.0, "kilogram", "kilograms"),
    KILOGRAM("kilogram", 1000.0, "kilogram", "kilograms"),
    KILOGRAMS("kilograms", 1000.0, "kilogram", "kilograms"),
    MG("mg", 0.001, "milligram", "milligrams"),
    MILLIGRAM("milligram", 0.001, "milligram", "milligrams"),
    MILLIGRAMS("milligrams", 0.001, "milligram", "milligrams"),
    LB("lb", 453.592, "pound", "pounds"),
    POUND("pound", 453.592, "pound", "pounds"),
    POUNDS("pounds", 453.592, "pound", "pounds"),
    OZ("oz", 28.3495, "ounce", "ounces"),
    OUNCE("ounce", 28.3495, "ounce", "ounces"),
    OUNCES("ounces", 28.3495, "ounce", "ounces"),
    NULL("", 0.0, "", "???");

    fun toGrams(n: Double): Double {
        return n * grams
    }

    fun fromGrams(n: Double): Double {
        return n / grams
    }

    fun printUnits(n: Double) {
        when {
            decimalPart(n) > 0 || Math.abs(n) > 1 || n == 0.0 -> print("$n $plural")
            else -> print("$n $singular")
        }
    }

    companion object {
        fun findByRepr(repr: String): Weight {
            for (enum in values()) {
                if (repr == enum.repr) return enum
            }
            return NULL
        }
    }
}


enum class Length(val repr: String, private val meters: Double, private val singular: String, val plural: String) {
    M("m", 1.0, "meter", "meters"),
    METER("meter", 1.0, "meter", "meters"),
    METERS("meters", 1.0, "meter", "meters"),
    KM("km", 1000.0, "kilometer", "kilometers"),
    KILOMETER("kilometer", 1000.0, "kilometer", "kilometers"),
    KILOMETERS("kilometers", 1000.0, "kilometer", "kilometers"),
    CM("cm", 0.01, "centimeter", "centimeters"),
    CENTIMETER("centimeter", 0.01, "centimeter", "centimeters"),
    CENTIMETERS("centimeters", 0.01, "centimeter", "centimeters"),
    MM("mm", 0.001, "millimeter", "millimeters"),
    MILLIMETER("millimeter", 0.001, "millimeter", "millimeters"),
    MILLIMETERS("millimeters", 0.001, "millimeter", "millimeters"),
    MI("mi", 1609.35, "mile", "miles"),
    MILE("mile", 1609.35, "mile", "miles"),
    MILES("miles", 1609.35, "mile", "miles"),
    YD("yd", 0.9144, "yard", "yards"),
    YARD("yard", 0.9144, "yard", "yards"),
    YARDS("yards", 0.9144, "yard", "yards"),
    FT("ft", 0.3048, "foot", "feet"),
    FOOT("foot", 0.3048, "foot", "feet"),
    FEET("feet", 0.3048, "foot", "feet"),
    IN("in", 0.0254, "inch", "inches"),
    INCH("inch", 0.0254, "inch", "inches"),
    INCHES("inches", 0.0254, "inch", "inches"),
    NULL("", 0.0, "", "???");

    fun toMeters(n: Double): Double {
        return n * meters
    }

    fun fromMeters(n: Double): Double {
        return n / meters
    }

    fun printUnits(n: Double) {
        when {
            decimalPart(n) > 0 || Math.abs(n) > 1 || n == 0.0 -> print("$n $plural")
            else -> print("$n $singular")
        }
    }

    companion object {
        fun findByRepr(repr: String): Length {
            for (enum in values()) {
                if (repr == enum.repr) return enum
            }
            return NULL
        }
    }
}

enum class Temperature (val repr: String, private val singular: String, val plural: String) {
    DEGREE_CELSIUS("degree celsius", "degree Celsius", "degrees Celsius"),
    DEGREES_CELSIUS("degrees celsius", "degree Celsius", "degrees Celsius"),
    CELSIUS("celsius", "degree Celsius", "degrees Celsius"),
    DC("dc", "degree Celsius", "degrees Celsius"),
    C("c", "degree Celsius", "degrees Celsius"),
    DEGREE_FAHRENHEIT("degree fahrenheit", "degree Fahrenheit", "degrees Fahrenheit"),
    DEGREES_FAHRENHEIT("degrees fahrenheit", "degree Fahrenheit", "degrees Fahrenheit"),
    FAHRENHEIT("fahrenheit", "degree Fahrenheit", "degrees Fahrenheit"),
    DF("df", "degree Fahrenheit", "degrees Fahrenheit"),
    F("f", "degree Fahrenheit", "degrees Fahrenheit"),
    KELVIN("kelvin", "Kelvin", "Kelvins"),
    KELVINS("kelvins", "Kelvin", "Kelvins"),
    K("k", "Kelvin", "Kelvins"),
    NULL("", "", "???");

    fun toCelsius(n: Double): Double {
        return when(plural) {
            "degrees Celsius" -> n
            "degrees Fahrenheit" -> (n - 32) * 5 / 9
            "Kelvins" -> n - 273.15
            else -> 0.0
        }
    }

    fun toFahrenheit(n: Double): Double {
        return when(plural) {
            "degrees Celsius" -> n * 9 / 5 + 32
            "degrees Fahrenheit" -> n
            "Kelvins" -> n * 9 / 5 - 459.67
            else -> 0.0
        }
    }

    fun toKelvin(n: Double): Double {
        return when(plural) {
            "degrees Celsius" -> n + 273.15
            "degrees Fahrenheit" -> (n + 459.67) * 5 / 9
            "Kelvins" -> n
            else -> 0.0
        }
    }

    fun printUnits(n: Double) {
        when {
            decimalPart(n) > 0 || Math.abs(n) > 1 || n == 0.0 -> print("$n $plural")
            else -> print("$n $singular")
        }
    }

    companion object {
        fun findByRepr(repr: String): Temperature {
            for (enum in values()) {
                if (repr == enum.repr) return enum
            }
            return NULL
        }
    }
}

fun isWeight(w: String) : Boolean {
    for (enum in Weight.values()) {
        if (w == enum.repr) return true
    }
    return false
}

fun isLength(w: String) : Boolean {
    for (enum in Length.values()) {
        if (w == enum.repr) return true
    }
    return false
}

fun isTemperature(w: String) : Boolean {
    for (enum in Temperature.values()) {
        if (w == enum.repr) return true
    }
    return false
}

fun getUnitPlural(repr: String): String {
    return when {
        isLength(repr) -> Length.findByRepr(repr).plural
        isWeight(repr) -> Weight.findByRepr(repr).plural
        isTemperature(repr) -> Temperature.findByRepr(repr).plural
        else -> "???"
    }
}

fun makeConversion(n: Double, sUnit: String, tUnit: String) {
    /*
    sUnit := source unit
    tUnit := target unit
     */
    when {
        isLength(sUnit) && isLength(tUnit) -> {
            if (n < 0) {
                print("Length shouldn't be negative")
            } else {
                val sLength = Length.findByRepr(sUnit)
                val tLength = Length.findByRepr(tUnit)
                val meters = sLength.toMeters(n)
                val converted = tLength.fromMeters(meters)
                sLength.printUnits(n)
                print(" is ")
                tLength.printUnits(converted)
            }
        }
        isWeight(sUnit) && isWeight(tUnit) -> {
            if (n < 0) {
                print("Weight shouldn't be negative")
            } else {
                val sWeight = Weight.findByRepr(sUnit)
                val tWeight = Weight.findByRepr(tUnit)
                val grams = sWeight.toGrams(n)
                val converted = tWeight.fromGrams(grams)
                sWeight.printUnits(n)
                print(" is ")
                tWeight.printUnits(converted)
            }
        }
        isTemperature(sUnit) && isTemperature(tUnit) -> {
            val sTemperature = Temperature.findByRepr(sUnit)
            val tTemperature = Temperature.findByRepr(tUnit)
            val converted = when(tTemperature.plural) {
                "degrees Celsius" -> sTemperature.toCelsius(n)
                "degrees Fahrenheit" -> sTemperature.toFahrenheit(n)
                "Kelvins" -> sTemperature.toKelvin(n)
                else -> 0.0
            }
            sTemperature.printUnits(n)
            print(" is ")
            tTemperature.printUnits(converted)
        }
        else -> {
            val source = getUnitPlural(sUnit)
            val target = getUnitPlural(tUnit)
            print("Conversion from $source to $target is impossible")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    do {
        print("Enter what you want to convert (or exit): ")
        val arg = scanner.next()
        if (arg != "exit") {
            var n: Double
            try {
                n = arg.toDouble()
            } catch(e: NumberFormatException) {
                scanner.nextLine()  // consume the rest of the input
                println("Parse error")
                continue
            }
            var sUnit = scanner.next().toLowerCase()
            if (sUnit == "degree" || sUnit == "degrees") sUnit = "$sUnit ${scanner.next().toLowerCase()}"
            scanner.next()  // consume the preposition (to, in)
            var tUnit = scanner.next().toLowerCase()
            if (tUnit == "degree" || tUnit == "degrees") tUnit = "$tUnit ${scanner.next().toLowerCase()}"
            makeConversion(n, sUnit, tUnit)
            println("")
        }
    } while (arg != "exit")
}
