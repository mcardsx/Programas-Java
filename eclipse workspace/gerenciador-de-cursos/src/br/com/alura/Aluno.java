package br.com.alura;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		
		if(this.nome == null) {
			throw new NullPointerException("O Aluno precisa de um Nome");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}
	
	
	@Override
	public String toString() {
		return "["+ "Aluno: " + this.nome + ", Numero de Matricula: " + this.numeroMatricula +"]";
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return this.nome.compareTo(outroAluno.nome);
	}
	
}
