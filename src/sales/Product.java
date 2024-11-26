package sales;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int counterProduct;

    private Product() {
        idProduct = ++counterProduct;
    }

    public Product(String name, Double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Producto ID: %d, Nombre: %s, Precio: %.2f €",
                idProduct, name, price
        );
    }
}
