import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Jefferson\\Documents\\testejava.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // esquema basico de ler um arquivo com buffered reader
            //intanciando o filereader
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }finally {
            try{
                if (fr != null){
                    fr.close();
                }
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}