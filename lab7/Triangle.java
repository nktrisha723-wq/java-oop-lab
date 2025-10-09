public class Triangle {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing a Triangle");
    }

    double area() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(4, 6);
        t.draw();
        System.out.println("Area of Triangle: " + t.area());
    }
}

output:-
Drawing a Triangle
Area of Triangle: 12.0
