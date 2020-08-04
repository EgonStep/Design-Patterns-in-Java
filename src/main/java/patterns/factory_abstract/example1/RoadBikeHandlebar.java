package patterns.factory_abstract.example1;

public class RoadBikeHandlebar implements Handlebar {

    private static final String TYPE = "DROP";

    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + TYPE);
    }
}
