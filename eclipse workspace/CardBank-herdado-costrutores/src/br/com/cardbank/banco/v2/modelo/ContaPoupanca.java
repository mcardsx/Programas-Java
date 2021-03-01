package br.com.cardbank.banco.v2.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void saque(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
		}
		
	}
	
	@Override
	public String toString() {
		
		return "Conta Poupança - " + super.toString();
	}

}
