package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Curso {
	
	private List<Aula> aulas = new LinkedList<Aula>();
	private Map<Integer, Aluno> alunoMap = new HashMap<>();
	private String instrutor, nome;
	private Collection<Aluno> alunos = new HashSet<>();
	
	public Curso(String instrutor, String nome) {
		
		this.instrutor = instrutor;
		this.nome = nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}	
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		
		int tempoTotal = 0;
		
		for(Aula aula : aulas) {
			tempoTotal += aula.getTempo(); 
		}
		return tempoTotal;

	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.alunoMap.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Collection<Aluno> getAlunos() {
		return Collections.unmodifiableCollection(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return ("[Nome do Curso: " + "<" + this.nome + ">," +" Tempo Total: "+ "<"+ this.getTempoTotal() +">" + " min " 
				+ "aulas : " + this.aulas);
	}

	public Aluno buscaMatriculado(int numeroDaMatricula) {
		return alunoMap.get(numeroDaMatricula);
	}
	
}
