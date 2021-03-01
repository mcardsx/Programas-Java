package br.com.cardbank.banco.v2.teste.util;

import java.util.Comparator;

import br.com.cardbank.banco.v2.modelo.Conta;

public class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}

}
