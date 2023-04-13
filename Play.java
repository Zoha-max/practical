package Abstraction;

//Class to play with Rectangle and Perimeter
class Play {
 public static void main(String[] args) {
     double length = 5.0;
     double width = 10.0;

     // Create an object of Rectangle
     Rectangle rectangle = new Rectangle() {
         @Override
         double calculateArea(double length, double width) {
             return length * width;
         }
     };

     // Calculate and display area of rectangle
     double area = rectangle.calculateArea(length, width);
     rectangle.displayArea(area);

     // Create an object of Perimeter
     Perimeter perimeter = new Perimeter();

     // Calculate and display perimeter of rectangle
     double rectPerimeter = perimeter.calculatePerimeter(length, width);
     perimeter.displayPerimeter(rectPerimeter);
 }
}





