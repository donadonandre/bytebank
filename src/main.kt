fun main() {
    val nomeBanco: String = "ByteBank"
    println("Bem vindo ao $nomeBanco")

    val contaAndre = Conta("André", 1000)
    contaAndre.deposita(100.0)
    contaAndre.deposita(50.0)

    val contaJoao = Conta(titular = "João", numero = 1001)
    contaJoao.deposita(200.0)
    contaJoao.saca(50.0)
    var efetuouTransferencia = contaJoao.transfere(50.0, contaAndre)

    if (efetuouTransferencia) {
        println("A transferência ocorreu de ${contaJoao.titular} para ${contaAndre.titular}!")
    }

    println("Conta do ${contaAndre.titular} tem ${contaAndre.saldo}")
    println("Conta do ${contaJoao.titular} tem ${contaJoao.saldo}")
}

class Conta(var titular: String, val numero: Int) {

    var saldo = 0.0
        private set

    fun deposita(valorADepositar: Double) {
        saldo += valorADepositar
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (valor <= saldo) {
            this.saca(valor)
            destino.deposita(valor)
            return true
        }

        return false
    }

    fun testaCondicoes(saldo: Double) {
        when {
            saldo > 0.0 -> println("Você tem saldo em conta!")
            saldo == 0.0 -> println("Sua conta está zerada!")
            else -> println("Você está com saldo devedor!")
        }
    }
}
