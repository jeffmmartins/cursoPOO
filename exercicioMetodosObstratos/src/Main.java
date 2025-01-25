import Entiites.enums.Color;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shape: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            System.out.println("Shape #" + i +  "Data");
            System.out.println("Rectangle or Circle (r/c) ?  ");
            char letter = sc.next().charAt(0);
            System.out.println("Color (Back/Blue/Red: ");
            Color color = Color.valueOf(sc.next());

            if ('r' == letter) {
                System.out.println("Width: ");
                Double widht = sc.nextDouble();
                System.out.println("Heigth: ");
                Double Height = sc.nextDouble();
            }
        }

        sc.close();

    }
}