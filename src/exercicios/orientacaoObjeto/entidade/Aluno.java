package exercicios.orientacaoObjeto.entidade;

public class Aluno {
    public String name;
    public double a;
    public double b;
    public double c;

    public void somarNota() {
        double total = a + b + c;
        if (total >= 60) {
            System.out.printf("Final grade = %.2f%nPASS", total);
        } else {
            double faltou = 60 - total;
            System.out.printf("Final grade = %.2f%nFailed%nMissing %.2f Points", total, faltou);

        }

    }

}
