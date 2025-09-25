import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix el preu original: ")
    val a = scanner.next().toFloat()
    print("Introdueix el preu actual:")
    val b = scanner.next().toFloat()
    val c = (a%b)/a*100
    print("El descompte es del $c%")
}