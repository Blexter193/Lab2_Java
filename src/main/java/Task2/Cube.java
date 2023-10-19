package Task2;

public class Cube extends FigureVolume {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double Volume() {
        return side * side * side;
    }
}
