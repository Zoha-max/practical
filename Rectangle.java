package Abstraction;

abstract class Rectangle {
    abstract double calculateArea(double length, double width); // Abstract method to calculate area

    void displayArea(double area) {
        System.out.println("Area of Rectangle: " + area);
    }
}