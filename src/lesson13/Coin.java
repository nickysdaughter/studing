package lesson13;

import java.util.Comparator;
import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diameter;
    private double weight;
    private String metal;
    private int nominal;

    public Coin() {

    }

    public Coin(double diameter, double weight, String metal, int nominal) {
        this.diameter = diameter;
        this.weight = weight;
        this.metal = metal;
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diameter=" + diameter +
                ", weight=" + weight +
                ", metal='" + metal + '\'' +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return Double.compare(coin.getDiameter(), getDiameter()) == 0 &&
                Double.compare(coin.getWeight(), getWeight()) == 0 &&
                getNominal() == coin.getNominal() &&
                Objects.equals(getMetal(), coin.getMetal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiameter(), getWeight(), getMetal(), getNominal());
    }


    @Override
    public int compareTo(Coin coin) {
        if (this.getMetal() != coin.getMetal()) {
            return this.getMetal().compareTo(coin.getMetal());
        }

        if (this.getNominal() != coin.getNominal()) {
            return this.getNominal() - coin.getNominal();
        }

        if (this.getDiameter() != coin.getDiameter()) {
            return Double.compare(this.getDiameter(), coin.getDiameter());
        }

        if (this.getWeight() != coin.getWeight()) {
            return Double.compare(this.getWeight(), coin.getWeight());
        }

        return 0;
    }
}
