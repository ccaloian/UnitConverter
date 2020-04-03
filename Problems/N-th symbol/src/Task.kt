import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val string = scanner.nextLine()
    val index = scanner.nextInt()

    println("Symbol # $index of the string \"$string\" is \'${string[index-1]}\'")
}
