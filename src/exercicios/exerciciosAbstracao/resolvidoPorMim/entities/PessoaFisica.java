package exercicios.exerciciosAbstracao.resolvidoPorMim.entities;

public class PessoaFisica extends Imposto {

    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double taxesPaid() {
        if (getRendaAnual() <= 20000.00 && getGastosComSaude() > 0) {
            return (getRendaAnual() * 0.15) - (getGastosComSaude() * 0.50);
        } else if (getRendaAnual() <= 20000.00) {
            return (getRendaAnual() * 0.15);
        } else if (getRendaAnual() > 20000.00 && getGastosComSaude() > 0) {
            return (getRendaAnual() * 0.25) - (getGastosComSaude() * 0.50);
        } else {
            return getRendaAnual() * 0.25;
        }
    }
}
