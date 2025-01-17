import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import javax.management.remote.JMXAddressable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Jeff", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Vera", 0.0 , 500.00);
        Account x = new Account(2,"Chico", 1000.0);
        Account y = new SavingAccount(3,"Josefa", 1000.0,  0.01);
        // upcasting: objeto businessAccoun e atribuilo na variavel tipo account

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "ANa", 0.0, 0.01);

        //Downcassting forcar a conversão de superclasse para subclasse, nem sempre da certo, tem que analisar com cuidado.

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }
        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalnace();
            System.out.println("Update!");
        }

        Account acc6 = new Account(1010,"Zuleide", 1000.0);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        // pegando o savingAccount e atribuindo a varaiavel acc7
        Account acc7 = new SavingAccount(1011, "Maria", 1000.0, 0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1012,"Maria", 1000.0, 500.0);
        acc8.withdraw(200.00);
        System.out.println(acc8.getBalance());

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}