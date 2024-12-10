package Entities;

public class ContaBancaria {
    private String nome;
    private  int conta;
    private int depositoInicial;

    public ContaBancaria(){}

    public ContaBancaria(String nome, int conta, int depositoInicial) {
        this.nome = nome;
        this.conta = conta;
        this.depositoInicial = depositoInicial;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public int getConta(){
        return conta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDepositoInicial(int depositoInicial){
        this.depositoInicial = depositoInicial;
    }

    public int getDepositoInicial(){
        return depositoInicial;
    }
}
