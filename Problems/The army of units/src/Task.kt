import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()

    when {
        size < 1 -> println("no army")
        size in 1..4 -> println("few")
        size in 5..9 -> println("several")
        size in 10..19 -> println("pack")
        size in 20..49 -> println("lots")
        size in 50..99 -> println("horde")
        size in 100..249 -> println("throng")
        size in 250..499 -> println("swarm")
        size in 500..999 -> println("zounds")
        size >= 1000 -> println("legion")
    }
}