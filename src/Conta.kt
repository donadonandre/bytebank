abstract class Conta(var titular: String, val numero: Int) {

    var saldo = 0.0
        private set

    fun deposita(valorADepositar: Double) {
        saldo += valorADepositar
    }

    open fun saca(valor: Double) {
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