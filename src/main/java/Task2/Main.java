package Task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 4);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(6, 4);
        Cube cube = new Cube(2);
        Pyramid pyramid = new Pyramid(8, 5);
        Circle circle = new Circle(5);
        Sphere sphere = new Sphere(4);

        System.out.println("Triangle Area: " + triangle.Area());
        System.out.println("Square Area: " + square.Area());
        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Cube Volume: " + cube.Volume());
        System.out.println("Pyramid Volume: " + pyramid.Volume());
        System.out.println("Circle Area: " + circle.Area());
        System.out.println("Sphere Volume: " + sphere.Volume());
    }
}
