package br.com.cardbank;

import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.ContaCorrente;

public class TestaBiblioteca {
	
	public static void main(String[] args) {

		Conta conta = new ContaCorrente(999, 99999);
	}
}
