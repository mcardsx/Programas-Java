package br.com.alura;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso("Mateus Cardoso", "javaCollections");
		
		Aula aula1 = new Aula("Revisando as Arraylists", 20);
		Aula aula2 = new Aula("Litsa de Objetos", 19);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		//javaCollections.getAulas().add(new Aula("ola", 23));// exception lançada.
		javaCollections.adiciona(new Aula("Aulaexemplo", 23));
		javaCollections.adiciona(aula1);
		javaCollections.adiciona(aula2);
		javaCollections.adiciona(aula3);
		
		List<Aula> aulasImutaveis = javaCollections.getAulas();
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
	
		Collections.sort(aulasMutaveis);
		//System.out.println(aulasMutaveis);
		
		int tempoTotal = javaCollections.getTempoTotal();
		
		System.out.println(javaCollections);
	}
}

