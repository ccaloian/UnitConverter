import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = 0
    var curr: Int
    repeat(scanner.nextInt()) {
        curr = scanner.nextInt()
        if (curr % 4 == 0 && curr > max) max = curr
    }
    print(max)
}
