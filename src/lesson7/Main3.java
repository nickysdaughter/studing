package lesson7;

public class Main3 {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Восток", 14, 140000, "самолет", 5);
        Tour tour2 = new Tour("Запад", 10, 90000, "самолет", 4);
        Tour tour3 = new Tour("Север", 14, 150000, "автобус", 3);
        Tour tour4 = new Tour("Юг", 7, 160000, "автобус", 4);
        Tour tour5 = new Tour("Кругосветка", 20, 300000, "самолет", 5);

        Tour[] tours = new Tour[5];
        tours[0] = tour1;
        tours[1] = tour2;
        tours[2] = tour3;
        tours[3] = tour4;
        tours[4] = tour5;

        for(int i = 0; i < tours.length; i++){
            tours[i].printInfo();
        }
    }
}
