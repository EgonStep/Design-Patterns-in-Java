package patterns.factory_abstract.example1;

public class MountainBikeHandlebar implements Handlebar {

    private static final String TYPE = "FLAT";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + TYPE);
    }
}
