import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,20,7);

        //criando uma stream a partir da lista.
        //MAP -> aplica uma função a cada elemente da minha stream
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        //IMprimir na tela - converte o stream para um vetor
        System.out.println(Arrays.toString(st1.toArray()) );

        //Stream.of - > permite colocar os elementos entre parenteses
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Stream infinita
        Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //fibonacci
        Stream<Long> st4 = (Stream<Long>) Stream.iterate(new Long[]{0L, 1L}, p-> new Long {p[1],p[0] + p[1]}).map(p->p[0]);
    }
}