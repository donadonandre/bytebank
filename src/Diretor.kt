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
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }
}