package services;

import entities.Contract;
import entities.Installments;

import java.time.LocalDate;
import java.util.Locale;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int month){
        // Verifica qual o valor da parcela
        double basicQuota = contract.getTotalValue() / month;

        for (int i = 1; i <= month; i++){
            // plusMonth está adicionando os meses , que está na variavel i; que vai ser a data original mais um mes;
            LocalDate dueDate = contract.getDate().plusMonths(i);
            // Calculando o juros de cada mês
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymenteFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installments(quota, dueDate));
        }
    }
}
