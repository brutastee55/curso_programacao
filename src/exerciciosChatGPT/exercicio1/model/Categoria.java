package exerciciosChatGPT.exercicio1.model;

public enum Categoria {
    ELETRONICOS(0.18),
    ROUPAS(0.12),
    LIVROS(0.05),
    ALIMENTOS(0.08);

    private final double aliquota;


    Categoria(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getAliquota() {
        return aliquota;
    }

    public double aplicarImposto(double valorBase) {
        return valorBase * (1 + aliquota);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "porcentagem='" + aliquota + '\'' +
                '}';
    }
}
