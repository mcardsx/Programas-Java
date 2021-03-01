package br.com.alura;

public class Trabalhador {

	private String nome;
	private int idade;

	public Trabalhador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Idade: " + this.idade;
	}

}
