import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
        print("Introdueix un numero ")
    val resposta : Int = scanner.next().toInt()
    print(resposta*2)
}