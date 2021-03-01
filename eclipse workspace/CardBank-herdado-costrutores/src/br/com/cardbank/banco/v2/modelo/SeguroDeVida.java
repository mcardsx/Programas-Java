package br.com.cardbank.banco.v2.modelo;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		
		return 10;
	}

}
