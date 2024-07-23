import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();

    abstract double calculateCircumference();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

   
    double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

   
    double calculateArea() {
        return side * side;
    }

    
    double calculateCircumference() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    double calculateArea() {
        return length * width;
    }

   
    double calculateCircumference() {
        return 2 * (length + width);
    }
}

public class shapesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        displayResult("Circle", circle);

        System.out.println("\nEnter the side of the square:");
        double side = sc.nextDouble();
        Square square = new Square(side);
        displayResult("Square", square);

        System.out.println("\nEnter the length and width of the rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        displayResult("Rectangle", rectangle);
    }

    private static void displayResult(String shapeName, Shape shape) {
        System.out.println("\nCalculating area and circumference for " + shapeName + ":");
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Circumference: " + shape.calculateCircumference());
    }
}

 	
 	
 	
