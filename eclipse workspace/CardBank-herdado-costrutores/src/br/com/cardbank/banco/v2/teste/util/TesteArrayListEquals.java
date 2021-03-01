package br.com.cardbank.banco.v2.teste.util;

import br.com.cardbank.banco.v2.modelo.*;
import java.util.ArrayList;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
	
		
		ArrayList<Conta> lista = new ArrayList();
		
		//ArrayList lista = new ArrayList(26); //capacidade inicial 		
 		//ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
		
		Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);
	        
	     Conta cc2 = new ContaCorrente(333, 3333);
	     	lista.add(cc2);
	     	
	     	System.out.println("tamanho da lista: " + lista.size());
	     	
	     	Conta ref = lista.get(0);
	     	
	     	System.out.println(ref.getNumero());
	     	
	     	lista.remove(0);
	     	
	     	System.out.println("tamanho da lista: " + lista.size());
	     	
	     	Conta cc3 = new ContaCorrente(444, 4444);
	     	lista.add(cc3);
	     	
	     	Conta cc4 = new ContaCorrente(555, 5555);
	     	lista.add(cc4);
	     	
	     	for(int i = 0; i < lista.size(); i++) {
	     		Object objectRef = lista.get(i);
	     		System.out.println(objectRef);
	     	}
	     	
	     	System.out.println("---------------");
	     	
	     	for(Conta objectRef : lista) {
	     		System.out.println(objectRef);
	     		
	     		
	     	}
	}

}
