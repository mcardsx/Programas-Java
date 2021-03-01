package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Trabalhador>{

	@Override
	public int compare(Trabalhador t, Trabalhador outroT) {
		
		return t.getIdade() - outroT.getIdade();
	}
}
