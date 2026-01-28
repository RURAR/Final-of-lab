import java.util.Scanner;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r=sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        double l=sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w=sc.nextDouble();

        Shape s1=new Circle(r);
        Shape s2=new Rectangle(l,w);

        System.out.println("Circle Area: "+s1.area());
        System.out.println("Rectangle Area: "+s2.area());
    }
}
