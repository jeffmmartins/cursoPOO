import service.PrintService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Quando utilizar o generics usar o <>
        PrintService<String> ps = new PrintService<>();

        System.out.println("How many values: ");
        int n = sc.nextInt();

        for (int i = 0 ; i<n ; i++){
            System.out.println("enter a number: ");
            String value = sc.nextLine();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());
        sc.close();
    }
}