package lesson13;

import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        Product product1 = new Product(120, "Мышка", 3.7);
        Product product2 = new Product(500, "Клавиатура", 4.7);
        Product product3 = new Product(30000, "Моноблок", 5);

        TreeSet<Product> products = new TreeSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

       TreeSet<Product> sortedByName = ProductUtils.sortByName(products);

        for (Product p : sortedByName) {
            System.out.println(p);
        }
    }
}
