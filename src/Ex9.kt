import java.util.Scanner
import kotlin.math.roundToLong

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix el preu original: ")
    val a = scanner.next().toFloat()
    print("Introdueix el preu actual:")
    val b = scanner.next().toFloat()
    val c = (a%b).roundToLong()
    print("El descompte es $c")
}