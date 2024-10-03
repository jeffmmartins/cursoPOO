import javax.sound.midi.Soundbank;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 2;
        double y = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", y);
        System.out.println("Boa noite");
        //Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        System.out.println("Resultado = " + y + " metros");
        System.out.printf("Resultado = %.3f metros%n", y);

        String nome = "Jeff";
        int idade = 56;
        double renda = 4.000;

        System.out.printf("%s tem %d anos e sua renda é %.2f%n", nome, idade, renda);

        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5230;
        char gender = 'M';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s which is price $ %f\n%s which is price %f\n" +
                "Record: %d years old. code %d and gender %s\n measure with decimal places: %f\n " +
                "Rouded: %.3f%n", product1,price1,product2,price2,age,code,gender,measure,measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Us decimal point %.3f",measure);

        int a, b;
        double resultado;
        a = 5;;
        b = 2;
        resultado = a/b;
        System.out.println(resultado);
        }
}