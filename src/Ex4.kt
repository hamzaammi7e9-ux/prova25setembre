import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
        print("Introdueix l'amplada de l'habitacó (en metres): ")
    val amplada  = scanner.next().toInt()
    print("Introdueix la llargada de l'habitació (en metres): ")
    val llargada = scanner.next().toInt()
    val area = amplada*llargada
    print("L'àrea de l'habitació son $area m²")
}