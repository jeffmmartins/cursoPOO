import Entities.Iindividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int numberTax = sc.nextInt();

        for (int i = 0 ; numberTax < i; i++){
            System.out.println("Tax payer #" + (i+1)  + " data: ");
            System.out.println("Indiviidual or Company (i/c)? ");
            char letter = sc.next().charAt(0);
            sc.nextLine();


            if (letter == 'i'){
                System.out.println("Name");
                String  name = sc.nextLine();
                System.out.println("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpednditures = sc.nextDouble();
                Iindividual individual = new Iindividual(name, anualIncome, healthExpednditures);
            } else {
                System.out.println("Name");
                String  name = sc.nextLine();
                System.out.println("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Number Of employees: ");
                int employee = sc.nextInt();
            }
        }


        sc.close();
    }
}