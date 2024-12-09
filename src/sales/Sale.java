package sales;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("El producto no puede ser nulo.");
        }
    }

     public double calculateTotal() throws EmptySaleException {
         if (products.isEmpty()) {
             throw new EmptySaleException();
         }
         totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
         return totalPrice;
     }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en la venta.");
        } else {
            System.out.println("Productos en la venta:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
