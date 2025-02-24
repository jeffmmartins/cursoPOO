import Entities.Account;
import exception.BusinessException;

import java.sql.BatchUpdateException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account Data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String name =  sc.nextLine();
        sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("WithDraw limit: ");
        double limit = sc.nextDouble();

        Account acc = new Account(number, name, balance, limit);

        System.out.println();
        System.out.println("Infrme a quatia para saque");
        double amount = sc.nextDouble();

        try {
            acc.withDraw(amount);
            System.out.println("Novo saldo: %.2f%n", acc.getBalance());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }

}