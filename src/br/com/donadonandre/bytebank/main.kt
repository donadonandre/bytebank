import br.com.donadonandre.bytebank.modelo.Cliente
import br.com.donadonandre.bytebank.modelo.ContaPoupanca

fun main() {

    //var totalContas = 0

    val andre = Cliente(nome="André",cpf="",senha=1)
    val contaPoupanca = ContaPoupanca(titular = andre, numero = 1000)
    //totalContas++

    //println("Total de contas: ${totalContas}")
    println("Total de contas: ${contaPoupanca.total}")

}

