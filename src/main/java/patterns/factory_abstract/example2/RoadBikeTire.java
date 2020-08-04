package patterns.factory_abstract.example2;

public class RoadBikeTire implements Tire {

    private static final String WIDTH = "NARROW";

    private static final String PRESSURE = "HIGH";

    @Override
    public void getDescription() {
        System.out.println("Road bike tire width: " + WIDTH + ", pressure: " + PRESSURE);
    }
}
