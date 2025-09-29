package exercicios.orientacaoObjeto;

import exercicios.orientacaoObjeto.entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.a = sc.nextDouble();
        aluno.b = sc.nextDouble();
        aluno.c = sc.nextDouble();

        aluno.somarNota();
    }
}
