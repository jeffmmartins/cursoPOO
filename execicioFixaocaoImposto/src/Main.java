import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int numberTax = sc.nextInt();

        for (int i = 0 ; numberTax < i; i++){
            System.out.println("Tax payer #" + (i+1)  + " data: ");
            System.out.println("Indiviidual or Company (i/c)? ");
            char letter = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name");
            String  name = sc.nextLine();
        }


        sc.close();
    }
}