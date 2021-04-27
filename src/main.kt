fun main() {
    val nomeBanco: String = "ByteBank"
    val numeroBanco = 10

    print("Bem vindo ao $nomeBanco")

    val titular = "André"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    println()
    println("Seja vem vindo $titular")
    println("Sua conta é $numeroConta")
    println("Seu saldo é $saldo")

    when {
        saldo > 0.0 -> println("Você tem saldo em conta!")
        saldo == 0.0 -> println("Sua conta está zerada!")
        else -> println("Você está com saldo devedor!")
    }
}