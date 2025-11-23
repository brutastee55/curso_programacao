package exercicios.exerciciosAbstracao.resolvidoPorMim.entities;

public class PessoaJuridica extends Imposto {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxesPaid() {
        if (getNumeroFuncionarios() <= 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }

    }
}
