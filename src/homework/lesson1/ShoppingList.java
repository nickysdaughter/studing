package homework.lesson1;

public class ShoppingList {
    public static void main(String[] args) {
        double sumOfMoney = 1000;
        double costOfPizza = 230;
        double costOfGum = 26;
        double costOfCandy = 2.5;

        int numberOfPurchasedPizzas = (int) (sumOfMoney / costOfPizza);
        //System.out.println(numberOfPizzas);

        double sumAfterPizzaPurchasing = sumOfMoney % costOfPizza;
        //System.out.println(sumAfterPizzaPurchasing);

        int numberOfPurchasedGums = (int) (sumAfterPizzaPurchasing / costOfGum);
        //System.out.println(numberOfPurchasedGums);

        double sumAfterGumsPurchasing = sumAfterPizzaPurchasing % costOfGum;
        //System.out.println(sumAfterGumsPurchasing);

        int numberOfPurchasedCandies = (int) (sumAfterGumsPurchasing / costOfCandy);
        //System.out.println(numberOfPurchasedCandies);

        System.out.println("На эти деньги мы можем купить: ");
        System.out.println(numberOfPurchasedPizzas + " пиццы");
        System.out.println(numberOfPurchasedGums + " жвачки");
        System.out.println(numberOfPurchasedCandies + " конфет");

        if(numberOfPurchasedCandies < 1){
            System.out.println("На конфеты денег не хватило:(");
        }
    }
}
