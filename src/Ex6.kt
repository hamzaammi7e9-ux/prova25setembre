import java.util.Scanner
import kotlin.math.roundToInt

fun main() {
    val scanner = Scanner(System.`in`)
    print("Quantes alumnes té la clase 1? ")
    val clase1 = scanner.next().toFloat()
    print("Quantes alumnes té la clase 2? ")
    val clase2 = scanner.next().toFloat()
    print("Quantes alumnes té la clase 3? ")
    val clase3 = scanner.next().toFloat()
    val taules = ((clase1/2)+(clase2/2)+(clase3/2)).roundToInt()
    print("Es necesitarán $taules taules")
}