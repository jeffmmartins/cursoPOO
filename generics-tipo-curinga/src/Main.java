import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Jeff", "Vera");
        printList(myStr);
    }

    public static void printList(List<?> list){
        for (Object object: list){
            System.out.println(object);
        }
    }
}