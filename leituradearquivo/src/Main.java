import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        File file = new File("C:\\Users\\Jefferson\\Documents\\CursoJava");
        Scanner sc = null;
        try {
            sc = new Scanner(file); // ao instanciar estou passando para ele o arquivo.
            // verifica uma nova linha no arquivo
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}