// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.Scanner;

public class PhoneBookEntry {

    String name;
    String phoneNumber;

    public PhoneBookEntry() {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBookEntry(String n, String num) {
        name = n;
        phoneNumber = num;
    }
    
    public void setPhoneNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter that person's phone number: ");
        phoneNumber = keyboard.nextLine();
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a person's name: ");
        name = keyboard.nextLine();
    }
    public String getName() {
        return name;
    }
}

