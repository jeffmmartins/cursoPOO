package Animais;

public class animal {
    protected String nome;
    protected String cor;
    protected double peso;
    protected double altura;
    protected String estadoDeEspirito;

    public animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    protected void dormir(){}
    protected void comer(){}
    public void soar(){
        System.out.println(" cri cri ");
    }
}
