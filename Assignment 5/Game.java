//Ocean Lu
//CS 141
//Assignment 5
//11.29.17

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String yes = "yes";
        double gameCount = 0;
        double gameWins = 0;
        while (yes.equals("yes")) {
            Scanner keyboard = new Scanner(System.in);
            Hand user = new Hand();
            Hand computer = new Hand();
            Deck deck = new Deck();
            deck.createDeck();
            deck.shuffle();
            System.out.println("***********************************\n* Welcome to the Black Jack Table *\n***********************************");
            user.addCard(deck.getDeck()[0], 0);
            computer.addCard(deck.getDeck()[1], 0);
            user.addCard(deck.getDeck()[2], 1);
            computer.addCard(deck.getDeck()[3], 1);
            if (user.getValue() == 21) {
                System.out.println("Blackjack!\nYou win!");
                gameCount++;
                gameWins++;
                break;
            } else if (computer.getValue() == 21) {
                System.out.println("Blackjack!\nThe dealer wins!");
                gameCount++;
                break;
            }
            int counter = 4;
            int c = 2;
            int games = 0;
            while (games == 0) {
                System.out.println(user);
                System.out.print("\nDo you want to stand or hit: ");
                String choice = keyboard.nextLine();
                if (choice.equals("stand")) {
                    if (user.getValue() < computer.getValue()) {
                        System.out.println("Smaller than the dealer's hand. Dealer wins!");
                        break;
                    } else if (user.getValue() > computer.getValue()) {
                        System.out.println("Bigger than the dealer's hand. You win!");
                        gameWins++;
                        break;
                    }
                } else if (choice.equals("hit")) {
                    user.addCard(deck.getDeck()[counter], c);
                    counter++;
                    computer.addCard(deck.getDeck()[counter], c);
                    counter++;
                    c++;
                    if (computer.blackjack()) {
                        System.out.println("The dealer got blackjack! The dealer wins!");
                        games++;
                        break;
                    }
                    if (user.bust()) {
                        System.out.println(user + "\nBust! The dealer wins!");
                        games++;
                        break;
                    }
                    if (computer.bust()) {
                        System.out.println("The dealer busted! You win!");
                    }
                    if (user.blackjack()) {
                        System.out.println(user + "\nBlackjack! You win!");
                        games++;
                        gameWins++;
                        break;
                    }
                } else {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Incorrect input. System exit.");
                        System.exit(0);
                    }
                }
            }
            gameCount++;
            double percentage = gameWins / gameCount * 100;
            System.out.printf("-----------------------------\nStatistics: \nnumber of games played: " + gameCount + "\nwins: %.1f%%\n-----------------------------\n", percentage);

            System.out.print("Do you want to play again? (yes/no) ");
            yes = keyboard.nextLine();
        }
        System.out.println("Bye Bye");
    }
}
