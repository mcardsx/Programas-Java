package br.com.cardbank.banco.v2.teste;

import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.ContaCorrente;
import br.com.cardbank.banco.v2.modelo.ContaPoupanca;
public class TesteObject {
	
	public static void main(String[] args) {
		
		Conta cC = new ContaCorrente(222, 212121);
		Conta cP = new ContaPoupanca(333, 232323); 
		
		System.out.println(cC);
		System.out.println(cP);
	}

}
