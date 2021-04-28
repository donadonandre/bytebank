import br.com.donadonandre.bytebank.modelo.Cliente
import br.com.donadonandre.bytebank.modelo.ContaCorrente
import br.com.donadonandre.bytebank.modelo.ContaPoupanca
import br.com.donadonandre.bytebank.modelo.Gerente

fun testaContasDiferentes() {
    val funcionario = Gerente(nome = "André", cpf = "111.111.111-11", salario = 1000.0, senha = 12345)

    println("modelo.Funcionario ${funcionario.nome}")
    println("Bonificação ${funcionario.bonificacao}")

    val contaCorrente = ContaCorrente(
        titular = Cliente(nome="André",cpf="",senha=1),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome="Maria",cpf="",senha=1),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
}

