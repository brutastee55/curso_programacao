package exerciciosChatGPT.exercicio1.model;

import java.util.Objects;

public class Produto {

    private String codigo;
    private String nome;
    private String descricao;
    private double precoBase;
    private boolean ativo = true;

    public final String MOEDA = "BRL";

    public Produto() {
    }

    public Produto(String codigo, String nome, double precoBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public Produto(String codigo, String nome, String descricao, double precoBase, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.precoBase = precoBase;
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase > 0) {
            this.precoBase = precoBase;
        } else {
            throw new RuntimeException("Preço deve ser maior que 0 (zero)");
        }

    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public final String etiqueta() {
        return getCodigo() + "-" + getNome();
    }

    public double precoParaVenda() {
        return getPrecoBase();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoBase=" + precoBase +
                ", ativo=" + ativo +
                ", MOEDA='" + MOEDA + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(precoBase, produto.precoBase) == 0 && ativo == produto.ativo && Objects.equals(codigo, produto.codigo) && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(MOEDA, produto.MOEDA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, descricao, precoBase, ativo, MOEDA);
    }
}
