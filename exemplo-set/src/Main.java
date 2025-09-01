import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //mais rápido porem não mantém a ordem, TreeSet mantem os dados ordenados, LinkedHashSet mantem a ordem.
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //set.remove("Tablet");
        //remove todos que ttem pelo menos tamanho igual ou maior a 3 ( sintaxe do predicado.
        //set.removeIf(x -> x.length() >= 3)
        System.out.println(set.contains("Notebook"));
        for(String p : set){
            System.out.println(p);
        }
    }
}