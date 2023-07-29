package br.com.alura.loja.strategy.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
// Exemplo de Desing Partterns Strategy
    public BigDecimal calcular(Orcamento orcamento, TipoDeImposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}
