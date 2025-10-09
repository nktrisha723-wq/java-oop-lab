public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a Circle");
    }

    double area() {
        double pi = 3.14; 
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        // Print area with 2 decimal places
        System.out.printf("Area of Circle: %.2f\n", c.area());
    }
}

output:-
Drawing a Circle
Area of Circle: 78.50
