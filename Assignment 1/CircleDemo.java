//Ocean Lu
//CS 141
//Assignment 1
//10.11.17

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a radius (double): ");
        double radius = keyboard.nextDouble();
        Circle circ = new Circle(radius);
        System.out.println("Area: " + circ.getArea());
        System.out.println("Diameter: " + circ.getDiameter());
        System.out.println("Circumference: " + circ.getCircumference());
    }
}
