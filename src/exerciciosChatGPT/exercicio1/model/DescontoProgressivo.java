package exerciciosChatGPT.exercicio1.model;

public final class DescontoProgressivo implements Desconto {

    @Override
    public double aplicar(double valor) {
        if (valor <= 100) {
            return valor * (1 - 0.05);
        } else if (valor <= 500) {
            return valor * (1 - 0.10);
        } else {
            return valor * (1 - 0.15);
        }
    }
}
