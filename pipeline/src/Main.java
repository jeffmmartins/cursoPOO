import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);


        //Aplicando o stream junto com o map, dentro do map foi utilizado a lambda
        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st1.toArray()));

        //Soma o acumuldor + o valor atual.
        int sum = list.stream().reduce(0,(x,y) -> x+y);
        System.out.println("Soma: " + sum);

        //convertendo no final para list.
        List<Integer> newList = list.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x*10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}