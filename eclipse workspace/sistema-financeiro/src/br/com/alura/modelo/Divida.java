package br.com.alura.modelo;

import java.util.*;

public class Divida {
	private double total;
	private String credor;
	private Cnpj cnpj;
	private Pagamento pagamentos = new Pagamento();

	public Pagamento getPagamentos() {
		return pagamentos = new Pagamento();
	}

	public Cnpj getCnpj() {
		return cnpj;
	}

	public void setCnpj(Cnpj cnpj) {
		this.cnpj = cnpj;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar() {
		return this.total - pagamentos.getValorPago();
	}
}