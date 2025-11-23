package exerciciosChatGPT.exercicio1.model;

public final class DescontoPercentual implements Desconto {

    private double percentual;

    public DescontoPercentual(double percentual) {
        if (percentual < 0 || percentual > 1) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 1");
        }
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        if (percentual < 0 || percentual > 1) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 1");
        }
        this.percentual = percentual;
    }

    @Override
    public double aplicar(double valor) {
        return valor * (1 - percentual);
    }
}
