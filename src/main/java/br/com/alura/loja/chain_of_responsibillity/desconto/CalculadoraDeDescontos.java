package br.com.alura.loja.chain_of_responsibillity.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
    Desconto desconto = new DescontoQuantidadeDeItens(
            new DescontoValorOrcamento(
                    new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
