package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-04-09");
        LocalDateTime d05 = LocalDateTime.parse("2024-04-09T10:20:36");
        Instant d06 = Instant.parse("2024-04-09T10:22:54Z");
        Instant d07 = Instant.parse("2024-04-09T10:22:54-03:00");

        LocalDate d08 = LocalDate.parse("09/04/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("09/04/2024 13:44", fmt2);


        System.out.println("d01 - > " + d01.toString());
        System.out.println("d02 -> " + d02.toString());
        System.out.println("d03 -> " + d03.toString());
        System.out.println("d04 -> " + d04.toString());
        System.out.println("d05 -> " + d05.toString());
        System.out.println("d06 -> " + d06.toString());
        System.out.println("d07 -> " + d07.toString());

        System.out.println(d08.toString());
        System.out.println(d09.toString());

    }
}
