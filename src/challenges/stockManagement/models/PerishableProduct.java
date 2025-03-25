package challenges.stockManagement.models;

public class PerishableProduct extends Product {
    // atributo
    private String expiryDate;

    // construtor
    public PerishableProduct(String name, double price, int code, String expiryDate) {
        super(name, price, code); // Chama o construtor da classe Product
        this.expiryDate = expiryDate;
    }

    // getter e setter
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    // toString
    // pego o toString() da minha classe pai e sobreescrevo colocando mais coisas
    @Override
    public String toString() {
        return super.toString() + " | Expiry date: " + expiryDate;
    }
}
