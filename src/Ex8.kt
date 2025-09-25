import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix un nombre: ")
    val a = scanner.next().toFloat()
    val b = (a*2)
    print("$a*2=$b")
}