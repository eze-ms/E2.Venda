package sales;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("El producte no pot ser nul.");
        }
    }

    public void calculateTotal() throws VendaBuidaException {
        if (products.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en la venta.");
        } else {
            System.out.println("Productes en la venda:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
