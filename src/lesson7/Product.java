package lesson7;

public class Product {
    //1 - объявляем переменные (хар-ки данного типа)
    private String name;
    private int id;
    private int fullPrice;
    private int salePrice;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getId() {
        return this.id;
    }
}
