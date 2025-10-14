import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full file path");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            //lendo a linha no arquivo
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                //ler a proxima linha
                line = br.readLine();
            }

            // para encontrar o preço médio de todos os produtos.
            double avg = list.stream()
                    .map(p-> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Avarege price: " + String.format("%.2f", avg));

            //Função que compara duas Strings
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    //realizando a comparação de forma inversa.
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}