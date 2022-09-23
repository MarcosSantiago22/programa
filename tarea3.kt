fun main () {

    val frio: ClosedFloatingPointRange<Float> = 8.6F..18.5F
    val templado: ClosedFloatingPointRange<Float> = 19.6F..32.5F
    val caluroso: ClosedFloatingPointRange<Float> = 32.6F..39.5F

    println("¿Cual es la temperatura actual?: ")
    val temperatura = readLine().toString().toFloat()

    when (temperatura) {
        in frio -> {
            println("Usa un abrigo hace frio")
        }
        in templado -> {
            println("Te irá bien si usas una Chaqueta, el clima es templado")
        }
        in caluroso -> {
            println("Es mejor que lleves algo ligero, hace calor")
        }
        else -> {
            println("Temperatura fuera de los rangos")
        }
    }

}