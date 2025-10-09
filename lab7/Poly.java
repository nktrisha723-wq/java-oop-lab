   class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }

    double area() {
        System.out.println("Calculating area of a generic shape");
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double area() {
        double pi = 3.14; 
     return pi * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    double area() {
        return length * width;
    }
}

public class PolyDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        s.draw();
        System.out.printf("Area: %.2f\n", s.area());

        System.out.println();

        s = new Triangle(4, 6);
        s.draw();
        System.out.printf("Area: %.2f\n", s.area());

        System.out.println();

        s = new Rectangle(5, 8);
        s.draw();
        System.out.printf("Area: %.2f\n", s.area());
    }
}
output:-
Drawing a Circle
Area: 78.50

Drawing a Triangle
Area: 12.00

Drawing a Rectangle
Area: 40.00
