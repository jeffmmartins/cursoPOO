package Animais;

public class Gato extends animal {
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("miau  miau");
    }
}
