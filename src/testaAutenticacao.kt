fun testaAutenticacao() {
    val gerente = Gerente(nome = "André", cpf = "111.111.111-11", salario = 1000.0, senha = 12345)
    val diretor = Diretor(nome = "João", cpf = "222.222.222-22", salario = 2000.0, senha = 54321, plr = 50.0)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretor, 54321)
}