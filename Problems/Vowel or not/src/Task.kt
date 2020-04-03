import java.util.Scanner

// write your function here
fun isVowel(c: Char): Boolean {
    val vowelLowerCase = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    val vowelUpperCase = c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    return vowelLowerCase || vowelUpperCase
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}