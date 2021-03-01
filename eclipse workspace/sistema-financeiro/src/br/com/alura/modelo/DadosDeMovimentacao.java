package br.com.alura.modelo;

public class DadosDeMovimentacao {
    private double valor;
    private Conta conta;
    private Calendar data;

    public double getEncargos() {
      return valor * 0.01;
    }

    // getters e setters
  }

  public class Pagamento {
	  
    private String favorecido;
    private String formaDePagamento;
    private DadosDeMovimentacao movimentacao = new DadosDeMovimentacao();
    // getters e setters
  }

  public class Deposito {
    private String numeroEnvelope;
    private DadosDeMovimentacao movimentacao = new DadosDeMovimentacao();
    
    // getters e setters
  }