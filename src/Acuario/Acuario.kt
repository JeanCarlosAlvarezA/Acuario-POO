package acuario

import kotlin.math.PI

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    open var tanque: Double = 0.0

    open var volumen: Int
        get() = largo * ancho * alto / 1000
        set(valor) {
            alto = (valor * 1000) / (largo * ancho)
        }

    open var forma: String = "Rectángulo"

    open val agua: Double
        get() = volumen * 0.9

    init {
        println("Acuario inicializado")
    }

    constructor(numeroPeces: Int) : this() {
        tanque = numeroPeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    fun imprimirTamano() {
        println("Forma: $forma")
        println("Ancho: $ancho cm")
        println("Largo: $largo cm")
        println("Alto: $alto cm")
        println("Volumen: $volumen litros")
        println("Agua: $agua litros (${agua / volumen * 100}% del volumen)")
    }
}

class TanqueTorre(
    diametro: Int,
    override var alto: Int
) : Acuario(
    largo = diametro,
    ancho = diametro,
    alto = alto
) {
    override var forma: String = "Cilindro"

    override var volumen: Int
        get() = (PI * (largo / 2.0) * (ancho / 2.0) * alto / 1000).toInt()
        set(valor) {
            alto = (valor * 1000 / (PI * (largo / 2.0) * (ancho / 2.0))).toInt()
        }
}