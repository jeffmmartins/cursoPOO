package entities;

public class Product {
    private String name;
    private Double preco;

    public Product(){}

    public Product(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
    public static boolean staticProductPredicate(Product p) {
        return p.getPreco() >= 100.00;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}
