import jdk.jshell.execution.LoaderDelegate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-12-16");
        LocalDate d05 = LocalDate.parse("16/12/2024", fmt01);
        LocalDate d06 = LocalDate.now();
        LocalDate pastweek = d06.minusDays(9);
        LocalDate nextweek = d06.plusDays(7);

        Period d07 = Period.between(pastweek, d06);
        SimpleDateFormat sd01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sd02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date y1= sd01.parse("25/06/2018");
        Date y2= sd01.parse("25/06/2018 15:46:07");
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Calendar cal =  Calendar.getInstance();
        cal.setTime(x1);
        int minutes = cal.get(Calendar.MINUTE)
;;        cal.add(Calendar.DAY_OF_MONTH,4);
        x1 = cal.getTime();


        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d04.format(fmt01));
        System.out.println(pastweek);
        System.out.println(nextweek);
        System.out.println("Duration: " + d07);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(" dia atual: " + x1);
        System.out.println("minutes " + minutes);
        }
}