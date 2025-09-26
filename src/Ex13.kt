import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix el valor de la temperatura en graus Celsius: ")
    val temperaturaCelsius: Float = scanner.next().toFloat()
    //Calculem la temp en Fahrenheit amb la seva formula
    val temperaturaFahrenheit: Float = (temperaturaCelsius * 9 / 5) + 32
    //Mostrem a la pantalla
    print("La temperatura en Fahrenheit és $temperaturaFahrenheit ºF")
}