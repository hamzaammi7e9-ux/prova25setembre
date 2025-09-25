import java.util.Scanner

fun main() {
    // Demanem el diametre de la pizza
    val scan : Scanner = Scanner(System.`in`)
    print("Introdueix el diàmetre de la pizza: ")
    val diametrePizza : Float = scan.next().toFloat()
    val radiPizza : Float = (diametrePizza/2).toFloat()
    // Calculem el àrea de la pizza a partir de la formula "π*r²"
    val superficiePizza : Float = ((radiPizza*radiPizza)*Math.PI).toFloat()
    // Mostrem el resultat de la superfície calculada a la pantalla
    print("La superfície de la pizza son $superficiePizza m²")
}