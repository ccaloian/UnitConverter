import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    val cond = num in -14..12 || num in 15..16 || num >= 19
    val out = if (cond) "True" else "False"

    println(out)
}
