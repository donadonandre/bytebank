fun testaComportamentosConta() {
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