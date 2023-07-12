package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d04 = LocalDate.parse("2023-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T08:24:30");
        Instant d06 = Instant.parse("2023-06-21T01:24:30Z");
        Instant d07 = Instant.parse("2023-06-21T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("21/06/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("21/06/2023 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate d10 = LocalDate.of(2023, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 6, 21, 01, 30);

        System.out.println("Local date: " + d01);
        System.out.println("Local date time: " + d02);
        System.out.println("Instant time GMT: " + d03);
        System.out.println("Local date.parse: " + d04);
        System.out.println("Local dateTime.parse: " + d05);
        System.out.println("Intant.parse: " + d06);
        System.out.println("Intant.parse com horario local de SP: " + d07);
        System.out.println("Usando DataTimeFormatter: " + d08);
        System.out.println("Usando DatimeFormatter com hora editada: " + d09);
        System.out.println("LocalDate.of: " + d10);
    }
}
