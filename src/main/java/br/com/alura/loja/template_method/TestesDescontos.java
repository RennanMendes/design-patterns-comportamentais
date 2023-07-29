package br.com.alura.loja.template_method;

import br.com.alura.loja.template_method.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calculadoraDescontos(primeiroOrcamento));
        System.out.println(calculadora.calculadoraDescontos(segundoOrcamento));
    }
}
