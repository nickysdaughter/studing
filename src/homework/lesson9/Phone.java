package homework.lesson9;

import java.util.Objects;

public class Phone {
    private double diagonal;
    private String processor;
    private int numberOfCores;
    private String model;
    private String manufacturer;

    public Phone() {

    }

    public Phone(double diagonal, String processor, int numberOfCores, String model, String manufacturer) {
        this.diagonal = diagonal;
        this.processor = processor;
        this.numberOfCores = numberOfCores;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void setDiagonal(double diagonal) {

        this.diagonal = diagonal;
    }

    public void setProcessor(String processor) {

        this.processor = processor;
    }

    public void setNumberOfCores(int numberOfCores) {

        this.numberOfCores = numberOfCores;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiagonal() {

        return diagonal;
    }

    public String getProcessor() {

        return processor;
    }

    public int getNumberOfCores() {

        return numberOfCores;
    }

    public String getModel() {

        return model;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " " + numberOfCores + " " + diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.getDiagonal(), getDiagonal()) == 0 &&
                getNumberOfCores() == phone.getNumberOfCores() &&
                Objects.equals(getProcessor(), phone.getProcessor()) &&
                Objects.equals(getModel(), phone.getModel()) &&
                Objects.equals(getManufacturer(), phone.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiagonal(), getProcessor(), getNumberOfCores(), getModel(), getManufacturer());
    }
}
