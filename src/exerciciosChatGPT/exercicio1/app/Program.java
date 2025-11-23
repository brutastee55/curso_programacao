package exerciciosChatGPT.exercicio1.app;

import exerciciosChatGPT.exercicio1.model.*;
import exerciciosChatGPT.exercicio1.util.PrecoUtils;

public class Program {
    public static void main(String[] args) {
//        Desconto d1 = new DescontoNenhum();
//        Desconto d2 = new DescontoPercentual(0.10);
//        Desconto d3 = new DescontoProgressivo();
//
//        System.out.println(Math.round((11.2 * 100.0) / 100.0));
//
//        System.out.println(PrecoUtils.aplicarDesconto(100, d1));
//        System.out.println(PrecoUtils.aplicarDesconto(100, d2));
//        System.out.println(PrecoUtils.aplicarDesconto(100, d3));
//
//        Estoque e = new Estoque();
//        e.adicionar("P100", 5);
//        e.adicionar("P100", 3);
//
//        System.out.println(e.getQuantidade("P100"));
//
//        e.remover("P100", 2);
//        System.out.println(e.getQuantidade("P100"));
//
//        //e.remover("P100", 10);
//
//        System.out.println(d1.aplicar(100));
//        System.out.println(d2.aplicar(100));
//        System.out.println(d3.aplicar(100));
//        System.out.println(d3.aplicar(600));

        Estoque estoque = new Estoque();
        estoque.adicionar("P100", 5);

        Produto produto = new ProdutoFisico("P100", "Teclado", "Teclado Gamer", 250.0, true, Categoria.ELETRONICOS, 0.8);
        Desconto desconto = new DescontoPercentual(0.10);
        ItemPedido itemPedido = new ItemPedido(produto, 2, desconto);
        Pedido pedido = new Pedido("PED-001");
        pedido.adicionarItem(itemPedido, estoque);


        System.out.println(pedido.total());

    }
}
