package br.com.alura.loja.strategy.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoDeImposto {
    BigDecimal calcular(Orcamento orcamento);
}
