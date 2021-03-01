package br.com.strategy;

public class ISS implements Imposto{

	@Override
	public double getImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + 50;
	}
}
