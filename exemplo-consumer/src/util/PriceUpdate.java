package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPreco(p.getPreco() * 1.1);
    }
}
