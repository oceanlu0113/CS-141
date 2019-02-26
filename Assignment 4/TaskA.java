//Ocean Lu
//CS141
//Assignment 4
//11.15.17 

import java.util.Scanner;
public class TaskA {
    public static void main (String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Grammar Points (30): ");
        double grammar = key.nextDouble();
        System.out.print("Spelling Points (20): ");
        double spelling = key.nextDouble();
        System.out.print("Correct Length Points (20): ");
        double length = key.nextDouble();
        System.out.print("Content Points (30): ");
        double content = key.nextDouble();
        Essay essay = new Essay();
        essay.setScore(grammar, spelling, length, content);
        essay.setScore(essay.getScore());
        System.out.println("Grammar Essay Score: " + essay.getScore() + "\nGrammar Essay Grade: " + essay.getGrade());
    }
}

