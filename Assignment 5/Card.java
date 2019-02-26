//Ocean Lu
//CS 141
//Assignment 5
//11.29.17

public class Card {

    private String face;
    private String suit;
    private String of;
    private int value;

    public Card() {
        face = "";
        suit = "";
        of = "";
    }

    public Card(int f, int s) {
        of = "of";
        if (f == 1) {
            face = "Ace";
            value = 11;
        } else if (f == 2) {
            face = "Two";
            value = f;
        } else if (f == 3) {
            face = "Three";
            value = f;
        } else if (f == 4) {
            face = "Four";
            value = f;
        } else if (f == 5) {
            face = "Five";
            value = f;
        } else if (f == 6) {
            face = "Six";
            value = f;
        } else if (f == 7) {
            face = "Seven";
            value = f;
        } else if (f == 8) {
            face = "Eight";
            value = f;
        } else if (f == 9) {
            face = "Nine";
            value = f;
        } else if (f == 10) {
            face = "Ten";
            value = f;
        } else if (f == 11) {
            face = "Jack";
            value = 10;
        } else if (f == 12) {
            face = "Queen";
            value = 10;
        } else if (f == 13) {
            face = "King";
            value = 10;
        }
        if (s == 0) {
            suit = "Spades";
        } else if (s == 1) {
            suit = "Hearts";
        } else if (s == 2) {
            suit = "Diamonds";
        } else if (s == 3) {
            suit = "Clubs";
        }
    }

    public String getSuit() {
        return suit;
    }
    
    public void changeValue(int v) {
        value = v;
    }

    public String getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return face + " " + of + " " + suit;
    }
}
