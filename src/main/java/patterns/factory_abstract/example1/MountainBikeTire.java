package patterns.factory_abstract.example1;

public class MountainBikeTire implements Tire {

    private static final String WIDTH = "WIDE";

    private static final String PRESSURE = "MEDIUM";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire. Width: " + WIDTH + ", pressure: " + PRESSURE);
    }
}
