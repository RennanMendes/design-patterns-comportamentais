package br.com.alura.loja.chain_of_responsibillity.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        return BigDecimal.ZERO;
    }
}
