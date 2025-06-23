import entities.Contract;
import services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato");
        System.out.println("Núemro: ");
        int number = sc.nextInt();
        System.out.println("Data: dd/MM/yyyy");
        LocalDate date = LocalDate.parse(sc.next(), dataFormatada);
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com os números das parcelas: ");
        int numeroDeParcelas = sc.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, 3);

        sc.close();

    }
}