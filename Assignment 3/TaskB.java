// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.ArrayList;

public class TaskB {

    public static void main(String[] args) {
        System.out.println("I'm going to ask you to enter 5 names and phone numbers.");
        ArrayList<PhoneBookEntry> book = new ArrayList<PhoneBookEntry>();
        for (int i = 0; i < 5; i++) {
            book.add(new PhoneBookEntry());
            book.get(i).setName();
            book.get(i).setPhoneNumber();
        }

        System.out.println("Here's the data you entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println("------------------------------\nName: " + book.get(i).getName() + "\nPhone number: " + book.get(i).getPhoneNumber());
        }
    }
}

