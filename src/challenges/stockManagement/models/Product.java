package challenges.stockManagement.models;

import java.util.Objects;

public class Product {
    // atributos
    private String name;
    private double price;
    private int code;

    // construtores
    public Product() {
    }

    public Product(String name, double price, int code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    // getters e setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    // equals - comparação de codigo
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Product product)) return false;
        return code == product.code;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    // toString()
    @Override
    public String toString() {
        return "Product: " + name.toUpperCase() +
                " | Price: R$%2.f" + price +
                " | Code: " + code ;
    }
}
