package util;

import entities.Product;

import java.util.function.Function;


//Function tem dois tipos, o de entrada e saída
public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
