package br.com.cardbank.banco.v2.teste.util;

import br.com.cardbank.banco.v2.modelo.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {
	
	public static void main(String[] args) {
	
		//List<Conta> lista = new Vector<>();     Usa Array por baixo, mas é threadsafe(multi pilhas)
			
		//List<Conta> lista = new LinkedList<>(); Lista linkada, "2 vias, indo e vindo"
		
		List<Conta> lista = new ArrayList<>();//  Usa Array por baixo
		
		Conta cc = new ContaCorrente(22, 11);
	        
	    Conta cc2 = new ContaCorrente(22, 11);
	     	
	    lista.add(cc);
	     	
	    boolean existe = lista.contains(cc2);
	    
	    System.out.println("já existe?" + existe);
	    
	     	for(Conta conta : lista) {
	     		System.out.println(conta);
	     		
	     	}
	     	
	}

}
