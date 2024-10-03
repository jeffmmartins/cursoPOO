import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int y, z;
        double resultado;
        y = 5;
        z = 2;
        resultado = (double)y/ z;
        System.out.println(resultado);

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Digite seu nome: ");
        input = sc.next();
        System.out.println("Seu nome é: " + input);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        String texto1, texto2;
        sc.nextLine();
        texto1 = sc.nextLine();
        texto2 = sc.nextLine();
        System.out.println("DADOS DIGITADOS");
        System.out.println(texto1);
        System.out.println(texto2);

        sc.close();
    }
}