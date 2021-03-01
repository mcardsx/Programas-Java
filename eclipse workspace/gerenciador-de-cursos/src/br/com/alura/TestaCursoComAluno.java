package br.com.alura;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JCheckBox;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
	Curso javaCollections = new Curso("Mateus Cardoso", "javaCollections");
		
		Aula aula1 = new Aula("Revisando as Arraylists", 20);
		Aula aula2 = new Aula("Litsa de Objetos", 19);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		javaCollections.adiciona(new Aula("Aulaexemplo", 23));
		javaCollections.adiciona(aula1);
		javaCollections.adiciona(aula2);
		javaCollections.adiciona(aula3);
		
		Aluno mateus = new Aluno("Mateus", 1019);
		Aluno babi = new Aluno("Babi", 1020);
		Aluno selma = new Aluno("Selma", 1021);
		
		javaCollections.matricula(mateus);
		javaCollections.matricula(babi);
		
		
		javaCollections.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		Aluno Cardoso = new Aluno("Mateus", 1019);
		
		boolean matriculado = javaCollections.estaMatriculado(Cardoso);
		System.out.println(matriculado);
		
		Aluno buscaMatriculado = javaCollections.buscaMatriculado(1019);
		System.out.println(buscaMatriculado);
		
		Map<Integer, String> testaMap = new HashMap<>();
		
		testaMap.put(10, "ten");
		testaMap.put(9, "nine");
		testaMap.put(8, "eitch");
		testaMap.put(7, "seven");
		testaMap.put(6, "six");
		testaMap.put(5, "five");
		
		Set<Integer> keySet = testaMap.keySet();
		
		for (Integer chave : keySet) { //foreach antes do java 8
			System.out.println(chave);
		}
		
		testaMap.values().forEach(value->{ //foreach java 8
			System.out.println(value);
		});
		
		
		
		/*Collection<Aluno> alunosModifies = javaCollections.getAlunos();
		alunosModifies.add(selma);*/ //Retorna exception!
		
		
	}
}
