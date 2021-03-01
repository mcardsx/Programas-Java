package br.com.cardbank.banco.v2.teste;

import br.com.cardbank.banco.v2.modelo.*;

public class TestaTributveis {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(2232, 4556); 
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		contaCorrente.deposite(100);
		
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(seguroDeVida);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}

}

