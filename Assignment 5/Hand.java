//Ocean Lu
//CS 141
//Assignment 5
//11.29.17

public class Hand {

    Card[] hand = new Card[52];

    public Hand() {
        for (int i = 0; i < 52; i++) {
            hand[i] = new Card();
        }
    }

    public Card[] getHand() {
        return hand;
    }

    public void addCard(Card c, int turn) {
        hand[turn] = c;
    }

    public Card getCard(int turn) {
        return hand[turn];
    }

    public int getValue() {
        int value = 0;
        for (int i = 0; i < 52; i++) {
            value += hand[i].getValue();
        }
        return value;
    }

    public void cardAce() {
        boolean ace = false;
        int counter = 0;
        for (int i = 0; i < 52; i++) {
            if (hand[i].getFace().equals("Ace")) {
                ace = true;
                counter = i;
            }
        }
        if (getValue() > 21 && ace) {
            hand[counter].changeValue(1);
        }
    }

    public boolean blackjack() {
        if (getValue() == 21) {
            return true;
        } else {
            return false;
        }
    }

    public boolean bust() {
        cardAce();
        if (getValue() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        cardAce();
        String temp = "";
        int counter = 0;
        for (int i = 0; i < 52; i++) {
            if (hand[i].getValue() == 0) {
                temp += "";
            } else {
                temp += hand[i] + "\n";
                counter += hand[i].getValue();
            }
        }
        return "Your hand is: \n" + temp + "<" + counter + " points>";
    }
}
