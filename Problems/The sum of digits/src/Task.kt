import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val hundreds = (num / 100) % 10
    val tens = (num / 10) % 10
    val units = num % 10
    println(hundreds + tens + units)
}