import br.com.donadonandre.bytebank.modelo.Autenticavel
import br.com.donadonandre.bytebank.modelo.Cliente
import br.com.donadonandre.bytebank.modelo.ContaPoupanca
import br.com.donadonandre.bytebank.modelo.totalContas

// Object Declarations
// Singleton
object Contador {
    var total = 0
}

fun main() {

    //var totalContas = 0

    val andre = Cliente(nome="André",cpf="",senha=1)
    val contaPoupanca = ContaPoupanca(titular = andre, numero = 1000)
    //totalContas++

    //println("Total de contas: ${totalContas}")
    //println("Total de contas: ${contaPoupanca.total}")

    println("Total de contas: ${Contador.total}")

    // Object Expressions
    val objAndre = object : Autenticavel {
        val nome: String = "Andre"
        val idade: Int = 32

        fun digaOla() : String {
            return "Olá"
        }

        override fun autentica(senha: Int): Boolean {
            return true
        }
    }
}
