package exerciciosChatGPT.exercicio1.model;

public class ItemPedido {

    private Produto produto;
    private Desconto desconto;

    private int quantidade;

    public ItemPedido(Produto produto, int quantidade, Desconto desconto) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Desconto getDesconto() {
        return this.desconto;
    }

    public double totalItem() {
        return produto.precoParaVenda() * quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                '}';
    }
}
