fun main() {
    val nomeBanco: String = "ByteBank"
    println("Bem vindo ao $nomeBanco")

    val contaAndre = Conta()
    contaAndre.titular = "André"
    contaAndre.numero = 123
    contaAndre.saldo = 100.0
    contaAndre.deposita(50.0)

    val contaJoao = Conta()
    contaJoao.titular = "João"
    contaJoao.numero = 321
    contaJoao.saldo = 200.0
    contaJoao.saca(50.0)
    var efetuouTransferencia = contaJoao.transfere(50.0, contaAndre)

    if (efetuouTransferencia) {
        println("A transferência ocorreu de ${contaJoao.titular} para ${contaAndre.titular}!")
    }

    println("Conta do ${contaAndre.titular} tem ${contaAndre.saldo}")
    println("Conta do ${contaJoao.titular} tem ${contaJoao.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valorADepositar: Double) {
        saldo += valorADepositar
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }

//    fun transfere(valor: Double, destino: Conta): Unit { -> Esse é o padrão que não precisa digitar
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (valor <= saldo) {
            this.saca(valor)
            destino.deposita(valor)
            return true
        }

        return false

    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Você tem saldo em conta!")
        saldo == 0.0 -> println("Sua conta está zerada!")
        else -> println("Você está com saldo devedor!")
    }
}

fun executandoFors() {
    println("-----------")
    println("PRIMEIRO FOR")

    for (i in 1..5) {
        println(i)
    }

    println("-----------")
    println("SEGUNDO FOR")

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}