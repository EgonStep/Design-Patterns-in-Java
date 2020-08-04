package patterns.factory_abstract.example2;

public class MountainBikeFactory implements BikeFactory {

    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new MountainBikeHandlebar();
        } else {
            return null;
        }
    }
}
