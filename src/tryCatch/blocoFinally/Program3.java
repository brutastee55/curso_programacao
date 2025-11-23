package tryCatch.blocoFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        File file = new File("C:\\abrirArquivoCursoJava\\teste.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.print("Error opening File: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
