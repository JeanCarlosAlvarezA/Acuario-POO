package acuario

fun construirAcuario() {
    val miAcuario = TanqueTorre(diametro = 25, alto = 45)
    miAcuario.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Color del tiburón: ${tiburon.color}")
    tiburon.comer()

    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
    ejecutarEjemploPropio()
}
