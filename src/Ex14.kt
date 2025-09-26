import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix número de començals: ")
    val nombreComençals = scanner.next().toInt()
    print("Introdueix preu del sopar: ")
    val preuSopar = scanner.next().toFloat()
    val costComençal = (preuSopar/nombreComençals)
    println("El preu del sopar per començal són $costComençal€")
}