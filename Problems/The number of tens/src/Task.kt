import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val tens = ((num - (num % 10)) / 10) % 10
    // val tens = (num / 10) % 10
    println(tens)
}