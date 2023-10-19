package Task2;

public class Pyramid extends FigureVolume {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double Volume() {
        return 1./3 * baseArea * height;
    }
}
