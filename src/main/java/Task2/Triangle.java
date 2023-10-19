package Task2;

public class Triangle extends FigureArea {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double Area() {
        return 0.5 * base * height;
    }
}
