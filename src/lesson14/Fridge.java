package lesson14;

import java.util.HashMap;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int value) {
        if (products.containsKey(product)) {
            int currentValue = products.get(product);
            products.put(product, value + currentValue);
        } else {
            products.put(product, value);
        }
    }

    public void printAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет");
            return;
        }
        int currentValue = products.get(product);
        if (currentValue < value) {
            products.remove(product);
            System.out.println("Продукта недостаточно");
            return;
        }
        products.put(product, currentValue - value);

    }
}
