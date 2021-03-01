package br.com.cardbank.banco.v2.teste;

import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.ContaCorrente;
import br.com.cardbank.banco.v2.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente c1 = new ContaCorrente(111, 1111);
		ContaPoupanca c2 = new ContaPoupanca(222, 2222);
		
		contas[0] = c1;
		contas[1] = c2;
		
		System.out.println(contas[0].toString());
		
		Conta ref = (ContaCorrente) contas[0];
		
		System.out.println(ref.getNumero());
		
		ContaPoupanca refp = (ContaPoupanca) contas[1];
		
		System.out.println(refp.toString());
		
		}

}
