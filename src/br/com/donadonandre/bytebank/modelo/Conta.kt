package br.com.donadonandre.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo = 0.0
        protected set

    var total = 0

    init {
        total++
    }

    fun deposita(valorADepositar: Double) {
        saldo += valorADepositar
    }

    abstract fun saca(valor: Double)

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