import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val len = scanner.nextInt()
    var count = 0
    repeat(len) {
        if (scanner.nextInt() > 0) count++
    }
    println(count)
}