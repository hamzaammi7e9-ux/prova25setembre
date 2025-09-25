import java.util.Scanner

fun main() {
    //Demanem l'amplaza, la llargada i l'alçada de l'habitació. Guardem els seus respectius valors en variables
    val scanner = Scanner(System.`in`)
    print("Introdueix l'amplada de l'aula (en metres): ")
    val ampladaHabitació : Float  = scanner.next().toFloat()
    print("Introdueix la llargada de l'aula (en metres): ")
    val llargadaHabitació : Float= scanner.next().toFloat()
    print("Introdueix l'alçada de l'aula (en metres): ")
    val alçadaHabitació : Float = scanner.next().toFloat()
    //Calculem el volum de l'habitació
    val volumHabitació : Float = ampladaHabitació*llargadaHabitació*alçadaHabitació
    print("El volum de l'habitació son $volumHabitació m²")
}