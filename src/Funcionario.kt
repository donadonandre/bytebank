open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // open val bonificacao get() = salario * 0.1 -> Outra forma
    open val bonificacao: Double
        get() {
            return salario * 0.1
        }
}