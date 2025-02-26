import jdk.jshell.execution.LoaderDelegate;
import model.entities.Reservation;
import model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //sempre que for mecher com data devo instanciar simpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Checkin date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Check out date (dd/MM/yyyy): ");
            Date chekOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkin, chekOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Checkin date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.println("Check out date (dd/MM/yyyy): ");
            chekOut = sdf.parse(sc.next());

            // metodo responsavel para atualizar as datas
            reservation.updatDates(checkin, chekOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid Date Format");
            //coloca outra exceção capturando essa exceçao do metodo updatesDAte. ou seja vai tentar o metodo algo dê errado cai nesse catch.
        } catch (DomainException e) {
            System.out.println("Error in Reservation " + e.getMessage());
            sc.close();
        }
    }
}