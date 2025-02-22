package Entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double wisthhDrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double wisthhDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.wisthhDrawLimit = wisthhDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWisthhDrawLimit() {
        return wisthhDrawLimit;
    }

    public void setWisthhDrawLimit(Double wisthhDrawLimit) {
        this.wisthhDrawLimit = wisthhDrawLimit;
    }

    public void deposit(){

    }

    public void withDraw (){

    }
}
