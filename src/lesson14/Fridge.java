package lesson14;

import java.util.ArrayList;
import java.util.Collections;
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

    public void printEndingProduct() {
        Integer smallestValue = Integer.MAX_VALUE;
        String smallestKey = null;
        for (HashMap.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() < smallestValue) {
                smallestKey = entry.getKey();
                smallestValue = entry.getValue();
            }
        }
        System.out.println("Меньше всего в холодильнике: " + smallestKey + " - " + smallestValue);

    }

    public void printWeightAllProducts() {
        int totalWeight = 0;
        for (Integer i : products.values()) {
            totalWeight += i;
        }
        System.out.println(totalWeight);
    }

    public void printSortedProductList() {
        ArrayList<String> sortedKeys = new ArrayList<>(products.keySet());
        Collections.sort(sortedKeys);
        for (String x : sortedKeys)
            System.out.println(x + " - " + products.get(x));
    }
}
