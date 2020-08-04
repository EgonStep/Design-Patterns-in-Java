package patterns.factory_abstract.example2;

public class RoadBikeFactory implements BikeFactory {

    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar();
        } else {
            return null;
        }
    }
}
