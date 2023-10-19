package Task2;

public class Square extends FigureArea {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double Area() {
        return side * side;
    }
}
