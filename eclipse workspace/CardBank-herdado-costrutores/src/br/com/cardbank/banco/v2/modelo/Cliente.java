
package br.com.cardbank.banco.v2.modelo;

/**
 * Classe que representa um cliente CardBank
 * 
 * @author Mateus
 * @version 0.1
 */
public class Cliente {

	private String nome;
	private String cpf;
	private Endereco endereco;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
