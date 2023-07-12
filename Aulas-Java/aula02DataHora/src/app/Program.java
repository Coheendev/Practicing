package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args){
        LocalDate d04 = LocalDate.parse("2023-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T08:24:30");
        Instant d06 = Instant.parse("2023-06-21T01:24:30Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
        System.out.println("r3 = "+r3);
        System.out.println("r4 = "+r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes  = " + d04.getMonthValue()); // or getMonth == Nome do mês
        System.out.println("d04 ano = " + d04.getYear());



    }
}
