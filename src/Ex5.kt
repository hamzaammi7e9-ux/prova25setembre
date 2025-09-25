import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un nombre 4 nombres ")
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    val c = scanner.next().toInt()
    val d = scanner.next().toInt()
    val resultat = ((a+b)*(c%d))
    print("($a+$b)*($c%$d)= $resultat")
}