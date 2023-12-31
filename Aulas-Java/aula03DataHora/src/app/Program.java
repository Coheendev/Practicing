package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args){
        LocalDate d04 = LocalDate.parse("2023-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T08:24:30");
        Instant d06 = Instant.parse("2023-06-21T01:24:30Z");

        LocalDate pastWeekLocalDate =d04.minusDays(7);
        LocalDate nextWeekLocalDate =d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant= d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant =d06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);

        System.out.println("T1 dias = " + t1.toDays());
    }
}
