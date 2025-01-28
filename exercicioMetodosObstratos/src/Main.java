import Entiites.enums.Color;
import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;

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

        List<Shape> list = new ArrayList<>();

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
                Double height = sc.nextDouble();
                list.add(new Rectangle(color,widht,height));
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shapes Area: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}