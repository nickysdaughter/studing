package lesson13;

import java.util.Comparator;
import java.util.TreeSet;

public class ProductUtils {

    public static TreeSet<Product> sortByName(TreeSet<Product> products) {
        TreeSet<Product> sorted = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                if (product.getName() != t1.getName()) {
                    return product.getName().compareTo(t1.getName());
                }

                if (product.getPrice() != t1.getPrice()) {
                    return product.getPrice() - t1.getPrice();
                }

                if (product.getRate() != t1.getRate()) {
                    return Double.compare(product.getRate(), t1.getRate());
                }
                return 0;
            }
        });
        sorted.addAll(products);
        return sorted;
    }
}
