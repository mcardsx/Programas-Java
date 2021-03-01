package br.com.cardbank.banco.v2.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.ContaCorrente;
import br.com.cardbank.banco.v2.modelo.ContaPoupanca;

public class TesteOrdenacaoPorNumero {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposite(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposite(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposite(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposite(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for(Conta contas : lista) {
			System.out.println(contas);
		}
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();	
		lista.sort(comparator);
		
		System.out.println("---------");
		
		for(Conta contas : lista) {
			System.out.println(contas);
		}
	}
	
}
