package lesson13;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.5, 2, "gold", 5);
        Coin coin2 = new Coin(2.5, 2, "gold", 5);
        Coin coin3 = new Coin(2, 10, "silver", 10);
        Coin coin4 = new Coin(5, 5, "bronze", 25);
        Coin coin5 = new Coin(5, 2, "silver", 25);
        Coin coin6 = new Coin(4, 2, "gold", 5);

        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin coin, Coin t1) {

                if (coin.getNominal() != t1.getNominal()) {
                    return coin.getNominal() - t1.getNominal();
                }

                if (coin.getDiameter() != t1.getDiameter()) {
                    return Double.compare(coin.getDiameter(), t1.getDiameter());
                }

                if (coin.getWeight() != t1.getWeight()) {
                    return Double.compare(coin.getWeight(), t1.getWeight());
                }

                if (coin.getMetal() != t1.getMetal()) {
                    return coin.getMetal().compareTo(t1.getMetal());
                }

                return 0;
            }
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin c : coins) {
            System.out.println(c);
        }
    }
}
