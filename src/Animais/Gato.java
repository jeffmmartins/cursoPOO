package Animais;

public class Gato {
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    // Metodos

    public void comer(){}
    public void dormir(){}
    public void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
