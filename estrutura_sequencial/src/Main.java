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
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        System.out.println("Resultado = " + y + " metros");
        System.out.printf("Resultado = %.3f metros%n", y);

        String nome = "Jeff";
        int idade = 56;
        double renda = 4.000;

        System.out.printf("%s tem %d anos e sua renda é %.2f%n", nome, idade, renda);
        }
}