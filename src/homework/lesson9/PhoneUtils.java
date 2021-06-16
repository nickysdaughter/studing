package homework.lesson9;

import java.util.ArrayList;


public class PhoneUtils {
    public static void printAllPhonesByProduction(ArrayList<Phone> phones, String manufacturer) {
        for (Phone phone : phones) {
            if (phone.getManufacturer().equals(manufacturer)) {
                System.out.println(phone.toString());
            }
        }
    }

    public static void printTheBiggestResolution(ArrayList<Phone> phones) {
        Phone biggestPhone = phones.get(0);
        for (Phone phone : phones) {
            if (phone.getDiagonal() > biggestPhone.getDiagonal()) {
                biggestPhone = phone;
            }
        }
        System.out.println(biggestPhone);
    }

    public static void printTheSmallestResolution(ArrayList<Phone> phones) {
        Phone smallestPhone = phones.get(0);
        for (Phone phone : phones) {
            if (phone.getDiagonal() < smallestPhone.getDiagonal()) {
                smallestPhone = phone;
            }
        }
        System.out.println(smallestPhone);
    }

    public static void printAverageDiagonalValue(ArrayList<Phone> phones) {
        double averageDiagonal = 0;
        for (Phone phone : phones) {
            averageDiagonal = averageDiagonal + phone.getDiagonal() / 10;
        }
        System.out.println(averageDiagonal);
    }
}