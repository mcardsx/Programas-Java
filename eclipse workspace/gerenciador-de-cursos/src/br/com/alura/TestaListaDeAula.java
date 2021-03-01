package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisando as Arraylists", 20);
		Aula aula2 = new Aula("Litsa de Objetos", 19);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//Collections.sort(aulas);// Metodo compareTo definido por nós na Classe.
		
		aulas.sort(Comparator.comparing(Aula :: getTempo));// Ordene as Aulas comparando o tempo das Aulas,
														  //sem alterar o compareTo da Classe. 
		
		for(Aula aula : aulas) {
			System.out.println(aula.toString());
		}
	}

}