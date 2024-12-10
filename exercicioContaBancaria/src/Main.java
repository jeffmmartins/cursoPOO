import Entities.ContaBancaria;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ContaBancaria conta = new ContaBancaria();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        conta.setConta(sc.nextInt());
        System.out.println("Enter account holder: ");
        conta.setNome(sc.next());
        sc.nextLine();
        System.out.println("Enter initial deposit value: ");
        conta.setDepositoInicial(sc.nextInt());

        System.out.println("Account data:");
        System.out.println("Account: " + conta.getConta() + ", Holder: " + conta.getNome() + ", Balance: " + conta.getDepositoInicial());

        System.out.println("Enter deposit Value: ");
        conta.DepositoValor(sc.nextInt());
        System.out.println("Updated account value:");
        System.out.println("Account: " + conta.getConta() + ", Holder: " + conta.getNome() + ", Balance: " + conta.getDepositoInicial());

        System.out.println("Enter a withraw value: ");
        conta.saque(sc.nextInt());
        System.out.println("Account: " + conta.getConta() + ", Holder: " + conta.getNome() + ", Balance: " + conta.getDepositoInicial());

        sc.close();


    }
}