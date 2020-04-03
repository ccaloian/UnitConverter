import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextLong()
    val op = scanner.next()
    val b = scanner.nextLong()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> if (b == 0L) println("Division by 0!") else println(a / b)
        else -> println("Unknown operator")
    }
}
