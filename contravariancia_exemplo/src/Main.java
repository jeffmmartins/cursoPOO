import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Object> myObjects = new ArrayList<Object>();
        myObjects.add("Maria");
        myObjects.add("ALex");

        //Declarando uma lista de qualquer tipo super number. no caso object
        List<? super Number> myNums = myObjects;

        myNums.add(10);
        myNums.add(3.4);

    }
}