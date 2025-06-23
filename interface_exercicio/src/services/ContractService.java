package services;

import entities.Contract;
import entities.Installments;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int month){
        contract.getInstallments().add(new Installments(206.04, LocalDate.of(2018,7,25)));
        contract.getInstallments().add(new Installments(208.04, LocalDate.of(2019,8,25)));
    }
}
