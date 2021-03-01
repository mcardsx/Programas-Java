package br.com.alura.modelo;

import java.util.*;

public class BalancoEmpresa {
    private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

    public void registraDivida(Divida divida) {
        dividas.put(divida.getCnpj(), divida);
    }

    public void pagaDivida(String cnpjCredor,Pagamento pagamento) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
        	pagamento.setCnpjPagador("9999999-999");
            pagamento.setPagador("Zé");
            pagamento.setValor(500);
            divida.getPagamentos().registra(pagamento);
        }
    }
}