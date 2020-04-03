import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt() > 0
    val b = scanner.nextInt() > 0
    val c = scanner.nextInt() > 0
    val res = (a && !b && !c) || (!a && b && !c) || (!a && !b && c)
    println(res)
}
