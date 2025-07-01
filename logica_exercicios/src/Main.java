import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter a number: ");
        double A = sc.nextDouble();

        double B = sc.nextDouble();

        System.out.println("SOMA = " + (A+B));

        sc.close();
    }
}