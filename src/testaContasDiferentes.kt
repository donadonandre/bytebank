fun testaContasDiferentes() {
    val funcionario = Funcionario(nome = "André", cpf = "111.111.111-11", salario = 1000.0)

    println("Funcionario ${funcionario.nome}")
    println("Bonificação ${funcionario.bonificacao()}")

    val contaCorrente = ContaCorrente(
        titular = "André",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Maria",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
}
