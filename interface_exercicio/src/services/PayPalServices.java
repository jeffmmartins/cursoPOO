package services;

public class PayPalServices implements OnlinePaymentService{
    @Override
    public double paymenteFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return amount * 0.1 * months;
    }
}
