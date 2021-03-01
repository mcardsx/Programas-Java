package br.com.cardbank.banco.v2.modelo.especial;

import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.SaldoInsuficienteException;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void saque(double valor) throws SaldoInsuficienteException {
		

	}

}
