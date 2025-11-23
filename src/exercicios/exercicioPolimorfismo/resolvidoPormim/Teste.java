package exercicios.exercicioPolimorfismo.resolvidoPormim;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse("15/03/2017", formato);



        System.out.println(date.format(formato));
    }
}
