package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // subtraindo ou adicionando dias de uma data, criando um novo objeto de date, pq o objeto de date é imutavel
        LocalDate pastWeekLocalDATE = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDATE = " + pastWeekLocalDATE);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant passWeekInstante = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstante = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("passWeekInstante = " + passWeekInstante);
        System.out.println("nextWeekInstante = " + nextWeekInstante);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t2 = Duration.between(pastWeekLocalDATE.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(passWeekInstante, d06);
        Duration t4 = Duration.between(d06, passWeekInstante);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }

}
