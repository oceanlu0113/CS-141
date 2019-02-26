// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.Scanner;
import java.util.ArrayList;

public class TaskC {

    public static void main(String[] args) {
        ArrayList<Question> set = new ArrayList<Question>();
        for (int i = 0; i < 10; i++) {
            set.add(new Question());
        }

        Player one = new Player(1);
        Player two = new Player(2);

        set.get(0).setQuestion("How are you today?");
        set.get(0).setPossibleAnswer("Good", 0);
        set.get(0).setPossibleAnswer("Bad", 1);
        set.get(0).setPossibleAnswer("Sad", 2);
        set.get(0).setPossibleAnswer("Mad", 3);
        set.get(0).setCorrectAnswerNum(2);

        set.get(1).setQuestion("What's the fastest fish in the ocean?");
        set.get(1).setPossibleAnswer("Snailfish", 0);
        set.get(1).setPossibleAnswer("Swordfish", 1);
        set.get(1).setPossibleAnswer("Sailfish", 2);
        set.get(1).setPossibleAnswer("Tiger shark", 3);
        set.get(1).setCorrectAnswerNum(2);

        set.get(2).setQuestion("What is the world's largest ocean?");
        set.get(2).setPossibleAnswer("Atlantic", 0);
        set.get(2).setPossibleAnswer("Pacific", 1);
        set.get(2).setPossibleAnswer("Artic", 2);
        set.get(2).setPossibleAnswer("Me", 3);
        set.get(2).setCorrectAnswerNum(1);

        set.get(3).setQuestion("How long do bull shark pregnancies last for?");
        set.get(3).setPossibleAnswer("18 years", 0);
        set.get(3).setPossibleAnswer("5-6 months", 1);
        set.get(3).setPossibleAnswer("1 year", 2);
        set.get(3).setPossibleAnswer("10-11 months", 3);
        set.get(3).setCorrectAnswerNum(3);

        set.get(4).setQuestion("The ocean cover _______ of the Earth's surface.");
        set.get(4).setPossibleAnswer("60%", 0);
        set.get(4).setPossibleAnswer("70%", 1);
        set.get(4).setPossibleAnswer("50%", 2);
        set.get(4).setPossibleAnswer("100%", 3);
        set.get(4).setCorrectAnswerNum(1);

        set.get(5).setQuestion("How does water move around the world?");
        set.get(5).setPossibleAnswer("Wind", 0);
        set.get(5).setPossibleAnswer("Gravity", 1);
        set.get(5).setPossibleAnswer("1 and 2", 2);
        set.get(5).setPossibleAnswer("Water Benders", 3);
        set.get(5).setCorrectAnswerNum(2);

        set.get(6).setQuestion("Ocean water moves in which direction?");
        set.get(6).setPossibleAnswer("North to South", 0);
        set.get(6).setPossibleAnswer("South to North", 1);
        set.get(6).setPossibleAnswer("Triangularly", 2);
        set.get(6).setPossibleAnswer("Circularly", 3);
        set.get(6).setCorrectAnswerNum(3);

        set.get(7).setQuestion("What type of ocean water is more dense?");
        set.get(7).setPossibleAnswer("Salt water (salty)", 0);
        set.get(7).setPossibleAnswer("Polar water (cold)", 1);
        set.get(7).setPossibleAnswer("Equator water (hot)", 2);
        set.get(7).setPossibleAnswer("Water close to the shore", 3);
        set.get(7).setCorrectAnswerNum(1);

        set.get(8).setQuestion("What are basalts?");
        set.get(8).setPossibleAnswer("Volcanic rocks on the ocean floor", 0);
        set.get(8).setPossibleAnswer("The best kinds of salt", 1);
        set.get(8).setPossibleAnswer("Volcanic eruptions under the water", 2);
        set.get(8).setPossibleAnswer("Volcanic ash found in the ocean", 3);
        set.get(8).setCorrectAnswerNum(0);

        set.get(9).setQuestion("What are phytoplankton?");
        set.get(9).setPossibleAnswer("A larger version of plankton", 0);
        set.get(9).setPossibleAnswer("Organisms that eat plankton", 1);
        set.get(9).setPossibleAnswer("Spongebob's friend", 2);
        set.get(9).setPossibleAnswer("Microscopic algae", 3);
        set.get(9).setCorrectAnswerNum(3);

        for (int i = 0; i < 10; i++) {
            System.out.println("Question " + (i + 1) + ": " + set.get(i).getQuestionText());
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + set.get(i).getPossibleAnswer(j));
            }
            if (i + 1 % 2 == 1) {
                System.out.println("Player one's turn.");
                one.chooseAnswer();
                if (one.getCurrentAnswer() == set.get(i).getCorrectAnswerNumber()) {
                    System.out.println("Correct. The right answer is option " + set.get(i).getCorrectAnswerNumber() + ": " + set.get(i).getCorrectAnswer());
                    one.incrementPoints();
                } else {
                    System.out.println("Incorrect. The right answer is option " + set.get(i).getCorrectAnswerNumber() + ": " + set.get(i).getCorrectAnswer());
                }
            } else {
                System.out.println("Player two's turn.");
                two.chooseAnswer();
                if (two.getCurrentAnswer() == set.get(i).getCorrectAnswerNumber()) {
                    System.out.println("Correct. The right answer is option " + set.get(i).getCorrectAnswerNumber() + ": " + set.get(i).getCorrectAnswer());
                    two.incrementPoints();
                } else {
                    System.out.println("Incorrect. The right answer is option " + set.get(i).getCorrectAnswerNumber() + ": " + set.get(i).getCorrectAnswer());
                }
            }
        }
        System.out.println("Player one points: " + one.getPoints());
        System.out.println("Player two points: " + two.getPoints());
        if (one.getPoints() > two.getPoints()) {
            System.out.println("Player one wins.");
        } else if (one.getPoints() < two.getPoints()) {
            System.out.println("Player two wins.");
        } else if (one.getPoints() == two.getPoints()) {
            System.out.println("Tied.");
        }
    }
}

