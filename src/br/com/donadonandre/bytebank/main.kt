import br.com.donadonandre.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()

    imprime(Unit)
    imprime(1)
    imprime(1.0)
    imprime(true)
    imprime("teste")
    imprime(endereco)
    imprime(Any()) // Ele mapeia para um Object do Java
}

fun imprime(valor: Any) {
    println(valor)
}

