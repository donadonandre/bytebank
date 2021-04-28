import br.com.donadonandre.bytebank.modelo.Cliente
import br.com.donadonandre.bytebank.modelo.ContaCorrente

fun testaComportamentosConta() {
    val nomeBanco: String = "ByteBank"
    println("Bem vindo ao $nomeBanco")

    val contaAndre = ContaCorrente(Cliente(nome="André",cpf="",senha=1), 1000)
    contaAndre.deposita(100.0)
    contaAndre.deposita(50.0)

    val contaJoao = ContaCorrente(Cliente(nome="João",cpf="",senha=1), numero = 1001)
    contaJoao.deposita(200.0)
    contaJoao.saca(50.0)
    var efetuouTransferencia = contaJoao.transfere(50.0, contaAndre)

    if (efetuouTransferencia) {
        println("A transferência ocorreu de ${contaJoao.titular} para ${contaAndre.titular}!")
    }

    println("modelo.Conta do ${contaAndre.titular} tem ${contaAndre.saldo}")
    println("modelo.Conta do ${contaJoao.titular} tem ${contaJoao.saldo}")
}