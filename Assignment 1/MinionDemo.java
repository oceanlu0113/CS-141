//Ocean Lu
//CS 141
//Assignment 1
//10.11.17

public class MinionDemo {

    public static void main(String[] args) {
        Minion one = new Minion("Kevin");
        Minion two = new Minion("Bob");
        Minion three = new Minion("Stuart");

        one.setPhrase("BANANA!");
        two.setPhrase("BABOI!");
        three.setPhrase("SA LA KA!");

        System.out.println("The first minion is called " + one.getName() + ", and he has " + one.getEyes() + " eyes.");
        System.out.println("The second minion is called " + two.getName() + ", and he has " + two.getEyes() + " eyes.");
        System.out.println("The third minion is called " + three.getName() + ", and he has " + three.getEyes() + " eyes.");
        System.out.println();
        System.out.print(one.getName() + "'s catchphrase is: ");
        one.sayPhrase();
        System.out.print(two.getName() + "'s catchphrase is: ");
        two.sayPhrase();
        System.out.print(three.getName() + "'s catchphrase is: ");
        three.sayPhrase();
    }
}
