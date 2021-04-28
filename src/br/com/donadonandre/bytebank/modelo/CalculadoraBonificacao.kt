package br.com.donadonandre.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    fun registra(funcionario: Any) {
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        }
    }

//    fun registra(gerente: modelo.Gerente) {
//        this.total += gerente.bonificacao()
//    }
//
//    fun registra(diretor: modelo.Diretor) {
//        this.total += diretor.bonificacao()
//    }
}