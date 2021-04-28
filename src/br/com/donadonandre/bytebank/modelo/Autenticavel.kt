package br.com.donadonandre.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}