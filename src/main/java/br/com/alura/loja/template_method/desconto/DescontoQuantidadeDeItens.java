package br.com.alura.loja.template_method.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeDeItens extends Desconto {

    public DescontoQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
