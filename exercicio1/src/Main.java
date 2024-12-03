import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp; // declarando a  variavel

        do {
            System.out.println("Digite a Temperatura em Celsius:");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit : %.1f%n", F);
            System.out.println("Deseja Repitir (s/n)? ");
            resp = sc.next().charAt(0);;

        } while (resp != 'n');
    }
}