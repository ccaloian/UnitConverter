import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    val yesCond = (abs(x1 - x2) == 2 && abs(y1 -y2) == 1) || (abs(y1 - y2) == 2 && abs(x1 -x2) == 1)
    print(if (yesCond) "YES" else "NO")
}