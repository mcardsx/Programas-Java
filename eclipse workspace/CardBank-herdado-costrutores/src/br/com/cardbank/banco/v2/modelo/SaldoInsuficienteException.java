package br.com.cardbank.banco.v2.modelo;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}

}
