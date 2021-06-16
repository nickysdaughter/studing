package homework.lesson9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(6.1, "A14 Bionic", 6, "iPhone 12", "Apple");
        Phone phone2 = new Phone(6.1, "A13 Bionic", 6, "iPhone 11", "Apple");
        Phone phone3 = new Phone(6.1, "A12 Bionic", 6, "iPhone XR", "Apple");
        Phone phone4 = new Phone(6.3, "Mediatek MT6765", 8, "Galaxy A12", "Samsung");
        Phone phone5 = new Phone(6.5, "Samsung Exynos 9611", 8, "Galaxy A51", "Samsung");
        Phone phone6 = new Phone(6.8, "Samsung Exynos 2100", 8, "Galaxy S21 Ultra", "Samsung");
        Phone phone7 = new Phone(6.53, "Mediatek Helio G80", 8, "Redmi 9", "Xiaomi");
        Phone phone8 = new Phone(6.67, "Qualcomm Snapdragon 732G", 8, "Redmi Note 10 Pro", "Xiaomi");
        Phone phone9 = new Phone(6.67, "Huawei Kirin 710A", 8, "10X Lite", "Honor");
        Phone phone10 = new Phone(6.8, "Qualcomm Snapdragon 730G", 8, "MOTO G9 Plus", "Motorola");

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);

        PhoneUtils.printAllPhonesByProduction(phones, "Samsung");
        PhoneUtils.printTheBiggestResolution(phones);

        //1 - вывести самый маленький телефон
        //2 - вывести значение средней диагонали

        PhoneUtils.printTheSmallestResolution(phones);
        PhoneUtils.printAverageDiagonalValue(phones);


    }
}
