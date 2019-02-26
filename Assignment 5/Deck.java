//Ocean Lu
//CS 141
//Assignment 5
//11.29.17

import java.util.Random;

public class Deck {

    Card[] cards = new Card[52];

    public void createDeck() {
        for (int suits = 0; suits < 4; suits++) {
            for (int faces = 0; faces < 13; faces++) {
                cards[faces+(13*suits)] = new Card(faces + 1, suits);
            }
        }
    }

    public Card drawCard(int n) {
        return cards[n];
    }

    public Card[] getDeck() {
        return cards;
    }

    public void shuffle() {
        int index;
        Card temp = new Card();
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }
    
    public String toString() {
        String temp = "";
        for (int i = 0; i < 52; i++) {
            temp += cards[i] + "\n";
        }
        return temp;
    }
}
