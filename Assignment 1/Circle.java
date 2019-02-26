//Ocean Lu
//CS 141
//Assignment 1
//10.11.17

public class Circle {

    private double Radius;
    private final double PI = 3.14159;

    public Circle() {
        Radius = 0.0;
    }

    public Circle(double r) {
        Radius = r;
    }

    public void setRadius(double r) {
        Radius = r;
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea() {
        return PI * Radius * Radius;
    }

    public double getDiameter() {
        return 2 * Radius;
    }

    public double getCircumference() {
        return 2 * PI * Radius;
    }

}
