import Entities.Department;
import Entities.HourContract;
import Entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Enum.WorkerLeve;;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLeve.valueOf(workerLevel), baseSalary, new Department(departmentName)); // associado ao objeto woorker esta outro objeto do tipo departamento
        System.out.println("How many contracts to this worker? ");
        int qtd = sc.nextInt();

        //for para entrar com os dados do contrato em uma lista
        for (int i = 1; i<=qtd; i++){
            System.out.print("Enter contract #" + i + " data: ");
            System.out.print("Date dd/MM/yyyy");
            Date contractate = sdf.parse(sc.next());
            System.out.print("VValuue per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration Hours? ");
            int duartion = sc.nextInt();
            //instaciondo a classe HOurContract
            HourContract contract = new HourContract(contractate, valuePerHour, duartion);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY: ");
        String  monthAndYear = sc.next();
        // Recortando e convertendo de string para inteiro;
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Deparment: " + worker.getDepartment().getName());
        // passando o income com duas casas decimais
        System.out.println("Income for : " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));


        sc.close();
    }
}