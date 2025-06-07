package Entities;

public class ContaBancaria {
    private String nome;
    private  int conta;
    private int depositoInicial;
    public int tax = 5;

    public ContaBancaria(){}

    public ContaBancaria(String nome, int conta, int depositoInicial) {
        this.nome = nome;
        this.conta = conta;
        this.depositoInicial = depositoInicial;
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


    public int getDepositoInicial(){
        return depositoInicial;
    }

    public int DepositoValor(int deposito){
        return this.depositoInicial += deposito;
    }

    public int saque(int saque){
         int result = this.depositoInicial -= saque;
         return this.depositoInicial = result - tax;
    }
}
