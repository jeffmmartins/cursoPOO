package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"Ana Clara",
                "João Pedro",
                "Mariana Silva",
                "Lucas Oliveira",
                "Beatriz Santos",
                "Gabriel Costa",
                "Laura Fernandes",
                "Pedro Almeida",
                "Sofia Rodrigues",
                "Rafael Pereira"
        };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGURADANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
