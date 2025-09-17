import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90 ));

        Double factor = 1.1;

        //expressão declarada.
        Consumer<Product> cons = p -> p.setPreco(p.getPreco() * factor);



        //list.forEach(new PriceUpdate());

        //list.forEach(Product::staticPriceUpdate);

        //list.forEach(Product::nonStaticPriceUpdate);

        //list.forEach(cons);
        //expresão lambda inline
        list.forEach(p -> p.setPreco(p.getPreco() * factor));

        list.forEach(System.out::println);
    }
}