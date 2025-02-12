import jdk.jshell.execution.LoaderDelegate;
import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);
        //sempre que for mecher com data devo instanciar simpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Checkin date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check out date (dd/MM/yyyy): ");
        Date chekOut = sdf.parse(sc.next());

        //metodo muito ruim
        if (!chekOut.after(checkin)) {
            System.out.println("Error in reservation ");
        }else {
            Reservation reservation = new Reservation(number,checkin,chekOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Checkin date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.println("Check out date (dd/MM/yyyy): ");
            chekOut = sdf.parse(sc.next());




               String error =  reservation.updatDates(checkin,chekOut);
               if(error != null) {
                   System.out.println("Error in Reservation " + error);
               }else {
                System.out.println("Reservation: " + reservation);
            }

            // metodo responsavel para atualizar as datas
            reservation.updatDates(checkin, chekOut);
            System.out.println("Reservation: " + reservation);
        }

        sc.close();
    }
}