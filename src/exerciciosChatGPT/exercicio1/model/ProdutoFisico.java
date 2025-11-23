package exerciciosChatGPT.exercicio1.model;

public class ProdutoFisico extends Produto {

    private Categoria categoria;
    private double pesoEmKg;

    public ProdutoFisico(String codigo, String nome, String descricao, double precoBase, boolean ativo, Categoria categoria, double pesoEmKg) {
        super(codigo, nome, descricao, precoBase, ativo);
        setCategoria(categoria);
        setPesoEmKg(pesoEmKg);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Categoria não pode ser nula");
        }
        this.categoria = categoria;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg) {
        if (pesoEmKg < 0.0) {
            throw new IllegalArgumentException("pesoEmKg deve ser >= 0");
        }
        this.pesoEmKg = pesoEmKg;
    }

    private double calcularFrete() {
        return this.pesoEmKg * 10.0;
    }

    @Override
    public double precoParaVenda() {
        double valor = super.precoParaVenda();
        valor = categoria.aplicarImposto(valor);
        valor += calcularFrete();
        return valor;
    }
}
