import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Jeff");
        list.add("Francisco");
        list.add(2,"Preta");

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("--------------------------");
        list.removeIf(x-> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("--------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        System.out.println(result);

        String name = list.stream().filter(x-> x.charAt(0) == 'N').findFirst().orElse(null);
        System.out.println(name);
    }
}