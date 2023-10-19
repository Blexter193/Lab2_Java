package Task3;

public class Flight {
    private Plane plane;
    private String id;

    public Flight(Plane plane, String id) {
        this.plane = plane;
        this.id = id;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getId() {
        return id;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setId(String id) {
        this.id = id;
    }
}
