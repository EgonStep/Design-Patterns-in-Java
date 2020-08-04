package patterns.factory_abstract.example2;

public class MountainBikeHandlebar implements Handlebar {

    private static final String TYPE = "FLAT";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + TYPE);
    }
}
