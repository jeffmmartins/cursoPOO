import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle widht and heigth");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.println("Area: " + rectangle.area());
        System.out.println("Primeter: " + String.format("%.2f",rectangle.perimeter()));
        System.out.println("Diagonal: " + String.format("%.2f",rectangle.diagonal()));

        sc.close();

    }
}