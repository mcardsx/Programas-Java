package br.com.alura;

import java.io.ObjectInputStream.GetField;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso("Mateus Cardoso", "javaCollections");
		
		List<Aula> aulas = javaCollections.getAulas();
		
		System.out.println(aulas);
		
		//javaCollections.getAulas().add(new Aula("ola", 23));// exception lançada.
		javaCollections.adiciona(new Aula("aula1", 23));
		
		System.out.println(aulas);
	}
}
