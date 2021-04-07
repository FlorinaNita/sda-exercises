package abstractclassexercises;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Rectangle(3,7),
                new Triangle(8,2,9),
                new Rectangle(10,6),
                new Triangle(5,9,13)
        };

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Perimeter is: " + shape.getPerimeter());
                System.out.println("Area is: " + shape.getArea());
                System.out.println("Number of sides: " + shape.getNumberSides());
                System.out.println();
            }
        }
    }
}
