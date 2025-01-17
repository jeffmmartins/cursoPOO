import Entities.Employee;
import jdk.jshell.execution.LoaderDelegate;

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

        // Declarando a lista do tipo employee
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        // for para percorrer a lista
        for (int  i = 0 ; i<=n; i++){
            System.out.println("Employee  #" + i + "data: ");
            System.out.println("Outsourced (y/n) ? ");
            char ch = sc.next().charAt(1);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hours: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
            }
        }


        sc.close();
    }
}