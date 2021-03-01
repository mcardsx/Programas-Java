package br.com.alura;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Mateus");
		alunos.add("Barbara");
		alunos.add("Selma");
		alunos.add("Paulo");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			
			System.out.println(aluno);
			
		}

		alunos.add("Mateus");// em Sets não repetem-se objetos
		System.out.println(alunos.size());
		

	}

}
