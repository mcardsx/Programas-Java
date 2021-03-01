package br.com.strategy;

public class ICMS implements Imposto{

	@Override
	public double getImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
