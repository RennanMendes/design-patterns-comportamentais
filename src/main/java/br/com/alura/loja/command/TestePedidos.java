package br.com.alura.loja.command;

import br.com.alura.loja.command.pedido.GeraPedido;
import br.com.alura.loja.command.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(gerador);
    }
}
