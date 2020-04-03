import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val b1 = scanner.nextInt()
    val b2 = scanner.nextInt()
    val b3 = scanner.nextInt()
    val asc = b1 <= b2 && b2 <= b3
    val desc = b1 >= b2 && b2 >= b3
    println(asc || desc)
}
