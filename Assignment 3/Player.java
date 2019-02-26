// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.Scanner;

public class Player {
    private int playerNumber;
    private int points;
    private int currentAnswer;
    
    public Player(int playerNum) {
        playerNumber = playerNum;
    }
    
    public void chooseAnswer() {
        System.out.print("Please enter a number of choice: ");
        Scanner keyboard = new Scanner (System.in);
        currentAnswer = keyboard.nextInt();
    }
    
    public int getCurrentAnswer() {
        return currentAnswer;
    }
    
    public void incrementPoints() {
        points++;
    }
    
    public int getPoints() {
        return points;
    }
}

