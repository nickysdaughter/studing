package lesson8.blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Deck deck = new Deck();
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToPlayers() {
        for (Player p : players) {
            Card randomCard = deck.randomCard();
            p.saveCardToHand(randomCard);

            Card randomCard2 = deck.randomCard();
            p.saveCardToHand(randomCard2);
        }
    }

    public void addCardsTillNeed(Player player) {
        player.printCardsInHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужна ли еще одна карта? (да/нет)");
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            Card card = deck.randomCard();
            player.saveCardToHand(card);
            addCardsTillNeed(player);
        }
    }

    public void addCardsTillNeed(Dealer dealer) {
        if (dealer.numberOfPoints() < 18) {
            Card card = deck.randomCard();
            dealer.saveCardToHand(card);
            addCardsTillNeed(dealer);
        }
    }

    public void printWinner(Player player, Dealer dealer) {
        if (player.numberOfPoints() > 21) {
            System.out.println("Выиграл крупье");
            dealer.printCardsInHand();
            return;
        }
        if (player.numberOfPoints() <= 21 && dealer.numberOfPoints() > 21) {
            System.out.println("Вы победитель");
            player.printCardsInHand();
            return;
        }

        if (player.numberOfPoints() >= dealer.numberOfPoints()) {
            System.out.println("Вы победитель");
            player.printCardsInHand();
        } else {
            System.out.println("Выиграл крупье");
            dealer.printCardsInHand();
        }
    }
}
