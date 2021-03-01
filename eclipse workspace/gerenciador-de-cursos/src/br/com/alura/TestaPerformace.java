package br.com.alura;

import java.util.*;

public class TestaPerformace {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<>();

		long inicioForAdd, fimForAdd, tempoDeExcecucaoForAdd,
		inicioForContains, fimForContains, tempoDeExcecucaoForContains;

		inicioForAdd = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		fimForAdd = System.currentTimeMillis();

		tempoDeExcecucaoForAdd = fimForAdd - inicioForAdd;
		System.out.println(tempoDeExcecucaoForAdd);

		inicioForContains = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		fimForContains = System.currentTimeMillis();

		tempoDeExcecucaoForContains = fimForContains - inicioForContains;
		System.out.println(tempoDeExcecucaoForContains);
	}

}