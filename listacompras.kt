fun main() {
    val listaDeCompras = mutableListOf<String>()
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("\nMenu:")
        println("1. Mostrar lista")
        println("2. Adicionar item")
        println("3. Remover item")
        println("0. Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> mostrarLista(listaDeCompras)
            2 -> adicionarItem(listaDeCompras, scanner)
            3 -> removerItem(listaDeCompras, scanner)
            0 -> {
                println("Saindo...")
                return
            }
            else -> println("Opção inválida. Por favor, escolha novamente.")
        }
    }
}

fun mostrarLista(lista: List<String>) {
    if (lista.isEmpty()) {
        println("A lista de compras está vazia.")
    } else {
        println("Lista de compras:")
        lista.forEachIndexed { index, item ->
            println("${index + 1}. $item")
        }
    }
}

fun adicionarItem(lista: MutableList<String>, scanner: java.util.Scanner) {
    print("Digite o item a ser adicionado à lista de compras: ")
    val item = scanner.next()
    if (!lista.contains(item)) {
        lista.add(item)
        println("$item foi adicionado à lista de compras.")
    } else {
        println("$item já está na lista de compras.")
    }
}

fun removerItem(lista: MutableList<String>, scanner: java.util.Scanner) {
    if (lista.isEmpty()) {
        println("A lista de compras está vazia.")
        return
    }

    mostrarLista(lista)

    print("Digite o número do item a ser removido (ou 0 para cancelar): ")
    val indice = scanner.nextInt()

    if (indice == 0) {
        println("Operação de remoção cancelada.")
        return
    }

    if (indice > 0 && indice <= lista.size) {
        val itemRemovido = lista.removeAt(indice - 1)
        println("$itemRemovido foi removido da lista de compras.")
    } else {
        println("Índice inválido.")
    }
}
