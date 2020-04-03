import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()
    val desks = (group1 / 2) + (group1 % 2) + (group2 / 2) + (group2 % 2) + (group3 / 2) + (group3 % 2)
    println(desks)
}
