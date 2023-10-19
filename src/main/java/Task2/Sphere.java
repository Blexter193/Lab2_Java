package Task2;

public class Sphere extends FigureVolume {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double Volume() {
        return 4. / 3 * Math.PI * radius * radius * radius;
    }
}
