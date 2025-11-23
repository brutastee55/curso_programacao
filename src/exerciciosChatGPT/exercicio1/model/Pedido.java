package exerciciosChatGPT.exercicio1.model;

import exerciciosChatGPT.exercicio1.util.PrecoUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String numero;
    private LocalDateTime criadoEm;
    private List<ItemPedido> itens;

    public Pedido(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número do pedido não pode ser vazio");
        }
        this.numero = numero;
        this.criadoEm = LocalDateTime.now();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido itemPedido, Estoque estoque) {
        if (itemPedido == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        String codigo = itemPedido.getProduto().getCodigo();
        int quantidade = itemPedido.getQuantidade();

        estoque.remover(codigo, quantidade);
        itens.add(itemPedido);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double total() {
        double soma = 0.0;

        for (ItemPedido item : itens) {
            soma += item.totalItem();
        }

        return PrecoUtils.arredondarDuasCasas(soma);
    }

    public final int quantidadeTotal() {
        int total = 0;

        for (ItemPedido item : itens) {
            total += item.getQuantidade();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero='" + numero + '\'' +
                ", criadoEm=" + criadoEm +
                ", itens=" + itens +
                '}';
    }
}
