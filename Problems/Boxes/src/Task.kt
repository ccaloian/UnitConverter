import java.util.*

fun greaterBox (x1: Int, y1: Int, z1: Int, x2: Int, y2: Int, z2: Int): Boolean {
    return if (x1 >= x2 && x1 >= y2 && x1 >= z2) {
        true
    } else if (y1 >= x2 && y1 >= y2 && y1 >= z2) {
        true
    } else z1 >= x2 && z1 >= y2 && z1 >= z2
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    if (greaterBox(x1, y1, z1, x2, y2, z2)) {
        println("Box 1 > Box 2")
    } else if (greaterBox(x2, y2, z2, x1, y1, z1)) {
        println("Box 1 < Box 2")
    } else if ((x1 + y1 + z1 == x2 + y2 + z2) && (x1 * y1 * z1 == x2 * y2 * z2)) {
        println("Box 1 = Box 2")
    } else {
        println("Incomparable")
    }
}
