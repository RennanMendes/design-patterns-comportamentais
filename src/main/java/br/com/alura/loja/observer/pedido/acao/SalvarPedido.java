package br.com.alura.loja.observer.pedido.acao;

import br.com.alura.loja.observer.pedido.AcaoAposGerarPedido;
import br.com.alura.loja.observer.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados!");
    }
}
