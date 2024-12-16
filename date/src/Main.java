import jdk.jshell.execution.LoaderDelegate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-12-16");
        LocalDate d05 = LocalDate.parse("16/12/2024", fmt01);
        LocalDate d06 = LocalDate.now();
        LocalDate pastweek = d06.minusDays(7);
        LocalDate nextweek = d06.plusDays(7);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d04.format(fmt01));
        System.out.println(pastweek);
        System.out.println(nextweek);

        }
}