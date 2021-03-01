package br.com.alura.modelo;

import java.util.ArrayList;

public class Cnpj extends ArrayList<String>{
	
	private String valor;
	
	public Cnpj (String valor) {
		this.valor = valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	private int primeiroDigitoCorretoParaCnpj() {
        // Calcula o primeiro d�gito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int primeiroDigitoVerificadorDoCnpj() {
        // Extrai o primeiro d�gito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o segundo d�gito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Extrai o segundo d�gito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    
    public boolean cnpjValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }
    
    @Override
    public boolean equals(Object o) {
    	
    	if(!(o instanceof Cnpj)) {
    		return false;
    	}
    	
    	Cnpj outroCnpj = (Cnpj) o;
    	return (this.valor.equals(outroCnpj.getValor()));
    }
    
    @Override
    public int hashCode() {
    	return this.valor.hashCode();
    }
    
}
