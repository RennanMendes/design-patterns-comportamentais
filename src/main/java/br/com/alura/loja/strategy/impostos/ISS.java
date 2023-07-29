package br.com.alura.loja.strategy.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS  implements TipoDeImposto{
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
