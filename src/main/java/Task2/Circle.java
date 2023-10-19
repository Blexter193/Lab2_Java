package Task2;

public class Circle extends FigureArea {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
}
