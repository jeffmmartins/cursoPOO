import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando um vetor e instanciando com valores
        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good Night"};

        // criando o arquivo, colacando o caminho de onde o arquivo vai ser criado.
        String path = "C:\\Users\\Jefferson\\Documents\\javateste.txt";

        // bloco try with resource, instanciando o buffered writer e file writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                // adicionando uma quebra de linha
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}