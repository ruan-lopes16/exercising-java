package challenges.stockManagement.models;

public class NonPerishableProduct extends Product{
    // atributos
    private String category;

    // construtor
    public NonPerishableProduct(String name, double price, int code, String category) {
        super(name, price, code); // Chama o construtor da classe Product
        this.category = category;
    }

    // getter e setter
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + " | Category: " + category;
    }
}
