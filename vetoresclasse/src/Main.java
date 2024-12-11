import entities.Produt;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produt[] produt = new Produt[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            produt[i] = new Produt(name,price);
        }

        double sum = 0.00;
        for (int i = 0 ; i<n; i++){
            sum += produt[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("Average: %.2f%n", avg);
        sc.close();
    }
}