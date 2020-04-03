import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    val sleep: String = if (h < a) {
        "Deficiency"
    } else if (h <= b) {
        "Normal"
    } else {
        "Excess"
    }

    println(sleep)
}