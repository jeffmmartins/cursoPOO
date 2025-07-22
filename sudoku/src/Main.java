import model.Board;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    final static static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;
    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));

       var option = -1;
       while(true){
           System.out.println("Selecione uam das opeções a seguir");
           System.out.println("1 - Iniciar um novo jogo");
           System.out.println("2 - COlocar um novo número");
           System.out.println("3 - Remover um número");
           System.out.println("4 - Visualizar jogo atual");
           System.out.println("5 - verificar status do jogo");
           System.out.println("6 - limpar jogo");
           System.out.println("7 - Finalizar jogo");
           System.out.println("8 - Sair");

           option = scanner.nextInt();
       }





    }
}