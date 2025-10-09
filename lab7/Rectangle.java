public class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 8);
        r.draw();
        System.out.println("Area of Rectangle: " + r.area());
    }
}

output:-
Drawing a Rectangle
Area of Rectangle: 40.0

