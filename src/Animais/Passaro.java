package Animais;

public class Passaro {
    static int numeroDePassaros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros ++;
    }
}
