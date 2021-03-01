package br.com.cardbank.banco.v2.teste.util;

import java.util.Comparator;

import br.com.cardbank.banco.v2.modelo.Conta;

public class ClienteDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomec1 = c1.getCliente();
		String nomec2 = c1.getCliente();
		
		return nomec1.compareTo(nomec2);
	}
	
	

}
