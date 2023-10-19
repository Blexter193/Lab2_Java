package Task3;

public class Plane {
    private String model;
    private int capacity;

    public Plane(final String model, final int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setModel(String name) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
