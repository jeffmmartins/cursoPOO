import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciando um objeto file do tipo File;
        File file = new File("C:\\Users\\Jefferson\\Documents\\testejava.txt");
        Scanner sc = null;
        try {
            // instanciando o sc passando como argumento o file.
            sc = new Scanner(file);
            // verifica se tem uma nova linha no arquivo
            while (sc.hasNextLine()){
                // caso exista uma nova linha no arquivo é impresso o que tem nessa linha.
                System.out.println(sc.nextLine());
            }
            //trantando o erro
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            // testando se o sc diferente de nulo
            if (sc != null){
                sc.close();
            }
        }
    }
}