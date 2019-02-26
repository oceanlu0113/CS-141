//Ocean Lu
//CS141
//Assignment 4
//11.15.17 

import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        CourseGrades grades = new CourseGrades();
        Scanner key = new Scanner(System.in);
        GradedActivity lab = new GradedActivity();
        System.out.print("Graded Activity score (100): ");
        lab.setScore(key.nextDouble());
        grades.setLab(lab);
        System.out.print("Exam questions (total): ");
        int pquestions = key.nextInt();
        System.out.print("Exam questions (missed): ");
        int pmissed = key.nextInt();
        System.out.print("Exam questions (minimum for passing): ");
        int pmin = key.nextInt();
        PassFailExam exam = new PassFailExam(pquestions, pmissed, pmin);
        grades.setPassFailExam(exam);
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
        grades.setEssay(essay);
        System.out.print("Questions (total): ");
        int fquestions = key.nextInt();
        System.out.print("Questions (missed): ");
        int fmissed = key.nextInt();
        FinalExam finalexam = new FinalExam(fquestions, fmissed);
        grades.setFinalExam(finalexam);
        System.out.println(grades);
        System.out.println("Average: " + grades.getAverage() + "\nHighest: " + grades.getHightest().getScore() + "\nLowest: " + grades.getLowest().getScore());
    }
}

