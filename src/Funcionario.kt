open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // open val bonificacao get() = salario * 0.1 -> Outra forma
    open fun bonificacao(): Double {
        return salario * 0.1
    }
}