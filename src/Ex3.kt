import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
        print("Introdueix un numero ")
    val nombre1 : Int = scanner.next().toInt()
    print("Introdueix un altre ")
    val nombre2 : Int = scanner.next().toInt()
    val resultat : Int = nombre1+nombre2
    print("$nombre1+$nombre2 = $resultat")
}