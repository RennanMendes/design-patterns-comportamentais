package br.com.alura.loja.observer;

import br.com.alura.loja.observer.pedido.GeraPedido;
import br.com.alura.loja.observer.pedido.GeraPedidoHandler;
import br.com.alura.loja.observer.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.observer.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(),
                new EnviarEmailPedido())
        );

        handler.execute(gerador);
    }
}
