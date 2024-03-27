import kotlin.math.pow

fun main() {
    println("Calculadora de Índice de Massa Corporal (IMC)")
    println("Por favor, informe seu gênero (M/F):")
    val genero = readLine()!!.uppercase()

    println("Por favor, informe sua altura em metros:")
    val altura = readLine()!!.toDouble()

    println("Por favor, informe seu peso em quilogramas:")
    val peso = readLine()!!.toDouble()

    val imc = calcularIMC(peso, altura)
    val resultadoIMC = obterResultadoIMC(genero, imc)

    println("Seu IMC é: $imc")
    println("Resultado do IMC: $resultadoIMC")
}

fun calcularIMC(peso: Double, altura: Double): Double {
    return peso / (altura.pow(2))
}

fun obterResultadoIMC(genero: String, imc: Double): String {
    return if (genero == "M") {
        when {
            imc < 20.7 -> "Abaixo do peso"
            imc < 26.4 -> "Normal"
            imc < 27.8 -> "Sobrepeso"
            imc < 31.1 -> "Obesidade"
            else -> "Obesidade Mórbida"
        }
    } else {
        when {
            imc < 19.1 -> "Abaixo do peso"
            imc < 25.8 -> "Normal"
            imc < 27.3 -> "Sobrepeso"
            imc < 32.3 -> "Obesidade"
            else -> "Obesidade Mórbida"
        }
    }
}
