package acuario

class PezGlobo : Pez(), AccionPez {
    override val color: String = "amarillo"

    override fun comer() {
        println("El pez globo come pequeños crustáceos.")
    }
}

fun ejecutarEjemploPropio() {
    println("=== Acuario de rescate ===")

    val acuario = TanqueTorre(diametro = 30, alto = 50)
    acuario.volumen = 30
    acuario.imprimirTamano()

    val pez = PezGlobo()
    println("Pez rescatado: color ${pez.color}")
    pez.comer()
}