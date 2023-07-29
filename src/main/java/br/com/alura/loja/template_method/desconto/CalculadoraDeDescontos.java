package br.com.alura.loja.template_method.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calculadoraDescontos(Orcamento orcamento) {
        Desconto desconto = new DescontoQuantidadeDeItens(
                new DescontoValorOrcamento(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}