package br.com.strategy;

public class ICCC implements Imposto {

	@Override
	public double getImposto(Orcamento orcamento) {

		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} 
		else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		} 
		else if (orcamento.getValor() > 3000) {
			return orcamento.getValor() * 0.08 + 30;
		}
		return 0;
	}

}
