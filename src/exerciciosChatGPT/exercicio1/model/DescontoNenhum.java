package exerciciosChatGPT.exercicio1.model;

public final class DescontoNenhum implements Desconto {


    @Override
    public double aplicar(double valor) {
        return valor;
    }
}

