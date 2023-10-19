package Task2;

public class Rectangle extends FigureArea {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double Area() {
        return firstSide * secondSide;
    }
}
