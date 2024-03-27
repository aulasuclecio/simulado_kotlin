fun main() {
    println("Conversor de Moedas")
    println("Moedas disponíveis: BRL - Real, USD - Dollar, EUR - Euro")
    println("Digite a moeda de origem (BRL, USD, EUR):")
    val moedaOrigem = readLine()!!.toUpperCase()
    
    println("Digite a moeda de destino (BRL, USD, EUR):")
    val moedaDestino = readLine()!!.toUpperCase()
    
    println("Digite a quantia a ser convertida:")
    val quantia = readLine()!!.toDouble()
    
    val valorConvertido = when (moedaOrigem) {
        "BRL" -> when (moedaDestino) {
            "BRL" -> quantia
            "USD" -> quantia / 4.95
            "EUR" -> quantia / 5.38
            else -> {
                println("Moeda de destino inválida.")
                return
            }
        }
        "USD" -> when (moedaDestino) {
            "BRL" -> quantia * 4.95
            "USD" -> quantia
            "EUR" -> quantia * 0.91 // 1 USD = 0.91 EUR
            else -> {
                println("Moeda de destino inválida.")
                return
            }
        }
        "EUR" -> when (moedaDestino) {
            "BRL" -> quantia * 5.38
            "USD" -> quantia * 1.10 // 1 EUR = 1.10 USD
            "EUR" -> quantia
            else -> {
                println("Moeda de destino inválida.")
                return
            }
        }
        else -> {
            println("Moeda de origem inválida.")
            return
        }
    }
    
    println("O valor convertido é: $valorConvertido")
}
