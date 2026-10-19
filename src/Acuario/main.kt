package acuario

fun construirAcuario() {
    val miAcuario = TanqueTorre(diametro = 25, alto = 45)
    miAcuario.imprimirTamano()
}

fun main() {
    construirAcuario()
}
