package exercicios.exerciciosMatriz.resolvido;

import java.util.Scanner;

public class ExercicioMatrizResolvido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //matriz bidimensional
        int[][] mat = new int[n][n];

        /*
         * for para preencher linhas e colunas de uma matriz bidimensional
         * mat.length -> quantidade de linhas
         * mat[i].length -> quantidade de colunas da linha
         *
         */
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        /*
         * for para mostrar o diagonal principal
         * mat.length -> quantidade de linhas
         *
         * quando coluna e linha for igual é o valor do diagonal principal [i][i]
         */
        System.out.println("Main diagonal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int quantidade = 0;

        /*
         * for para conta a quantidade de valores negativos
         * mat.length -> quantidade de linhas
         * mat[i].length -> quantidade de colunas da linha
         *
         */
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    quantidade++;
                }
            }
        }

        System.out.print("Negative numbers: " + quantidade);
        sc.close();
    }
}
