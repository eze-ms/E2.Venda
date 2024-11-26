package sales;

import java.util.ArrayList;
import java.util.List;

public class SalesApp {
    public static void main(String[] args) {
        try {

            Product producte1 = new Product("Laptop", 999.99);
            Product producte2 = new Product("Mouse", 25.50);

            Sale sale = new Sale();

            try {
                sale.calculateTotal();
            } catch (VendaBuidaException e) {
                System.out.println(e.getMessage());
            }

            sale.addProduct(producte1);
            sale.addProduct(producte2);
            sale.calculateTotal();


            sale.showProducts();
            System.out.println("Preu total: " + sale.getTotalPrice() + " €");

            try {
                List<Product> products = new ArrayList<>();
                System.out.println(products.get(0));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Excepció capturada: " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
