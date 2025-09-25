import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix un nombre: ")
    val a = scanner.next().toInt()
    val b = (a+1)
    print("Despres ve el $b")
}