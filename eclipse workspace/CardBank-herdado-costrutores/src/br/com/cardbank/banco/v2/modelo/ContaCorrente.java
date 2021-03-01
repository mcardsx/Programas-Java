package br.com.cardbank.banco.v2.modelo;


public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public void saque(double valor) throws SaldoInsuficienteException{
		
		if (super.saldo < valor) {
			throw new SaldoInsuficienteException("Temos um problema, saldo: " + this.saldo
					+ " valor do saque: " + valor);
		}
		super.saldo -= valor + 0.5;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.05;
	}
	
	@Override
	public String toString() {
		
		return "Conta Corrente - " + super.toString();
	}

}