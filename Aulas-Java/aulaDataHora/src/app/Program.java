package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Program {
    public static void main(String[] args){
        LocalDate d04 = LocalDate.parse("2023-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T08:24:30");
        Instant d06 = Instant.parse("2023-06-21T01:24:30Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = "+ d04);
        System.out.println("d04 = "+ d04.format(fmt1));

        System.out.println("d05 = " +d05.format(fmt2));

        System.out.println("d06 = " + fmt3.format(d06));
    }
}
