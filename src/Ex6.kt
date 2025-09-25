import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    //Demanem el nombre de alumnes per cada clase
    //Llegim els valor introduits i els guardem a les seves variables

    print("Quantes alumnes té la clase 1? ")
    val alumnesClase1 : Int = scanner.next().toInt()

    print("Quantes alumnes té la clase 2? ")
    val alumnesClase2 : Int = scanner.next().toInt()

    print("Quantes alumnes té la clase 3? ")
    val alumnesClase3 : Int = scanner.next().toInt()

    //Calculem el nª de pupitres necessaris a cada classe.
    val pupitresClase1 : Int = alumnesClase1/2 + alumnesClase1%2
    val pupitresClase2 : Int = alumnesClase2/2 + alumnesClase2%2
    val pupitresClase3 : Int = alumnesClase3/2 + alumnesClase3%2
    //Sumem tots els nº de pupitres necessaris de cada classe.
    val numPupitres : Int = pupitresClase1+pupitresClase2+pupitresClase3
    print("Es necesitarán $numPupitres pupitres")
}