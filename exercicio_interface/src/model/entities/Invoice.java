package model.entities;

public class Invoice {

    private Double basicPaymente;
    private Double tax;

    public Invoice(){}

    public Invoice(Double basicPaymente, Double tax) {
        this.basicPaymente = basicPaymente;
        this.tax = tax;
    }

    public Double getBasicPaymente() {
        return basicPaymente;
    }

    public void setBasicPaymente(Double basicPaymente) {
        this.basicPaymente = basicPaymente;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    // utilizou  gettax porque se for alterado algo no tax nao vou precisar alterar no metodo gettotalpayment;
    public Double getTotalPayment(){
        return getBasicPaymente() - getTax();
    }
}
