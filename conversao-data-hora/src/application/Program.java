package application;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args){

        LocalDate d01 = LocalDate.parse("2024-04-09");
        LocalDateTime d02 = LocalDateTime.parse("2024-04-09T15:00:00");
        Instant d03 = Instant.parse("2024-04-09T15:00:00Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Passado: " + pastWeekLocalDate);
        System.out.println("Futuro: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("Passado: " + pastWeekLocalDateTime);
        System.out.println("Futuro: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Passado: " + pastWeekInstant);
        System.out.println("Futuro: " + nextWeekInstant);

        // calculando duração com durations

        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("Duração = " + t1.toDays());
    }
}
