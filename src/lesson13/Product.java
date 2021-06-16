package lesson13;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int price;
    private String name;
    private double rate;

    public Product() {
    }

    public Product(int price, String name, double rate) {
        this.price = price;
        this.name = name;
        this.rate = rate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() &&
                Double.compare(product.getRate(), getRate()) == 0 &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getName(), getRate());
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        if (this.getRate() != product.getRate()) {
            return Double.compare(this.getRate(), product.getRate());
        }

        if (this.getPrice() != product.getPrice()) {
            return this.getPrice() - product.getPrice();
        }

        if (this.getName() != product.getName()) {
            return this.getName().compareTo(product.getName());
        }

        return 0;
    }
}
