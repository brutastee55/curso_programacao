package exerciciosChatGPT.exercicio1.model;

public class ProdutoDigital extends Produto {

    private Categoria categoria;
    private int tamanhoEmMB;

    public ProdutoDigital(String codigo, String nome, double precoBase, Categoria categoria, int tamanhoEmMB) {
        super(codigo, nome, precoBase);
        setCategoria(categoria);
        setTamanhoEmMB(tamanhoEmMB);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getTamanhoEmMB() {
        return tamanhoEmMB;
    }

    public void setTamanhoEmMB(int tamanhoEmMB) {
        this.tamanhoEmMB = tamanhoEmMB;
    }

    @Override
    public double precoParaVenda() {
        double valor = super.precoParaVenda();
        valor = categoria.aplicarImposto(valor);
        return valor;
    }
}
