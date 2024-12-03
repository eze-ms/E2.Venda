package sales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("product1", 15.50);
        Product product2 = new Product("product2", 5.5);
        Product product3 = new Product("product3", 20.50);
        Product product4 = new Product("product4", 10.3);

        Sale sale = new Sale();
        sale.addProduct(product1);
        sale.addProduct(product2);
        sale.addProduct(product3);
        sale.addProduct(product4);

        System.out.println("calculateTotal result with a list with products:");
        try {
            System.out.println(sale.calculateTotal());
        } catch (EmptySaleException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("CalculateTotal result with a list without products:");
        try {
            Sale emptySale = new Sale();
            emptySale.calculateTotal();
        } catch (EmptySaleException e) {
            System.err.println(e.getMessage());
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        try {
            System.out.println(list.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
