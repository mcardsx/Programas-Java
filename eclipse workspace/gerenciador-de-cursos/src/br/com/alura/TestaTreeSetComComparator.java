package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestaTreeSetComComparator {
	
	public static void main(String[] args) {
		
		TreeSet<Trabalhador> trabalhadores = new TreeSet<>(new OrdenaPorIdade());		
		
		Trabalhador duda = new Trabalhador("meduardafranca", 102);
		Trabalhador jose = new Trabalhador("Jos�", 28);
		Trabalhador joseval = new Trabalhador("Jos�val", 38);
		Trabalhador ze = new Trabalhador("z�", 48);
		
		trabalhadores.add(duda);
		trabalhadores.add(ze);
		trabalhadores.add(joseval);
		trabalhadores.add(jose);
		
		Iterator<Trabalhador> iterador = trabalhadores.iterator();
		
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
