import model.Board;
import model.Space;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
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

           switch (option){
               case 1 -> starteGame(positions);
               case 2 -> inputNumber();
               case 3 -> removeNumber();
               case 4 -> showCurrentGame();
               case 5 -> showGameStatus();
               case 6 -> clearGame();
               case 7 -> finishGame();
               case 8 -> System.exit(0);
               default -> System.out.println("Opção invalida, selecione uma das opções do menun");
           }
       }





    }

    private static void finishGame() {
    }

    private static void clearGame() {
    }

    private static void showGameStatus() {
    }

    private static void showCurrentGame() {
    }

    private static void removeNumber() {
    }

    private static void inputNumber() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi inicializado");
            return;
        }
        System.out.println("Informa a coluna em que o numero será inserido");
    }

    private static void starteGame(Map<String, String> positions) {
        if(nonNull(board)){
            System.out.println("O jogo foi iniciado");
            return;
        }
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++){
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++){
                String posistionConfig = positions.get("%s, %s".formatted(i, j));
                int expected = Integer.parseInt(posistionConfig.split(";")[0]);
                boolean fixed = Boolean.parseBoolean(posistionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        board = new Board(spaces);
        System.out.println("O jogo está pronto para começar");
    }

    private static int runUntilGetValidNumber(final int min, final int max){
        int current = scanner.nextInt();
        while (current<min || current > max ){
            System.out.printf("Informe um número entre %s e %s\n", min, max);
            current = scanner.nextInt();
        }
        return current;

    }

}