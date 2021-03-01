package br.com.cardbank.banco.teste;

import br.com.cardbank.banco.modelo.*;

public class TestaSistema {
	public static void main(String[] args) {
		SistemaInterno sistemaInterno = new SistemaInterno();
		Gerente gerente = new Gerente();

		gerente.setSenha(1111);

		gerente.autentica(1111);
	}

}
