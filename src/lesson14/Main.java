package lesson14;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.addProduct("Яблоко", 5);
        fridge.addProduct("Груша", 3);
        fridge.addProduct("Слива", 2);
        fridge.addProduct("Яблоко", 7);

        fridge.printAllProducts();
        fridge.getProduct("Яблоко", 30);
        fridge.printAllProducts();

        fridge.printSortedProductList();
        fridge.printEndingProduct();
        fridge.printWeightAllProducts();


    }
}
