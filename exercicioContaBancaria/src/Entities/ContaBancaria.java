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
}
