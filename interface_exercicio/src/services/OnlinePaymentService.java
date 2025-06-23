package services;

public interface OnlinePaymentService {

    double paymenteFee(Double amount);
    double interest(Double amount, Integer months);
}
