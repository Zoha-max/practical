package Abstraction;
//Class for Perimeter
class Perimeter {
 double calculatePerimeter(double length, double width) { // Method to calculate perimeter
     return 2 * (length + width);
 }

 void displayPerimeter(double perimeter) {
     System.out.println("Perimeter of Rectangle: " + perimeter);
 }
}