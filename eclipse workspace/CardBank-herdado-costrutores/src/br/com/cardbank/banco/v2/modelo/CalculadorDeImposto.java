package br.com.cardbank.banco.v2.modelo;


public class CalculadorDeImposto {
	private double TotalImposto;
	
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.TotalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.TotalImposto;
	}
}
