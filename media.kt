fun main() {
    println("Calculadora de Média Escolar")
    println("Digite a quantidade de notas:")
    val quantidadeNotas = readLine()!!.toInt()

    var soma = 0
    println("Digite as $quantidadeNotas notas:")
    for (i in 1..quantidadeNotas) {
        val nota = readLine()!!.toInt()
        soma += nota
    }

    val media = soma.toDouble() / quantidadeNotas
    println("A média é: $media")
}


