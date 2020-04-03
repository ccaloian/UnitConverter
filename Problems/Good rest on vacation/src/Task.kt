import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val foodPerDay = scanner.nextInt()
    val oneWayFlight = scanner.nextInt()
    val hotelPerNight = scanner.nextInt()
    val totalCost = (days * foodPerDay) + ((days - 1) * hotelPerNight) + 2 * oneWayFlight
    println(totalCost)
}