import entities.LogEntry;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path");
        //lendo o caminho completo que foi passad;
        String  path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            //Instanciando o set, hashset o mais rapido de todos e no problema é so contrar os usuáios unicos sem importar a orderm
            Set<LogEntry> set = new HashSet<>();

            //começar ler o arquivo, lendo a primeira linha do arquivo
            String line = br.readLine();
            //enquanto line for diferente de nul,leia com sucesso a primeira linha.
            while (line != null){

                String[] fields = line.split("");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                //nçao permite adicionar objeto igual, já é regra do set.
                set.add(new LogEntry(username,moment));


                //lendo a proxima linha
                line = br.readLine();
            }

            //Tamanho do conjunto.
            System.out.println("Total users: " + set.size());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}