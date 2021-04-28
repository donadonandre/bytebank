class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            return salario + plr
        }
}