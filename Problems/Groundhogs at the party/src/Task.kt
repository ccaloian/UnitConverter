import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeses = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    val res = (10 <= reeses && reeses <= 20 && !weekend) || (15 <= reeses && reeses <= 25 && weekend)
    println(res)
}