public class Shape {
    void draw() {
        System.out.println(" shape is square");
    }

    double area(double L) {
        System.out.println("Calculate area of a  square");
        return L*L;
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        System.out.println("Area: " + s.area(2));
    }
}

output:-
 shape is square
Calculate area of a  square
Area: 4.0
