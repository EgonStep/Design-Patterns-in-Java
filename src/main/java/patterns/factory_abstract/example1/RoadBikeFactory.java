package patterns.factory_abstract.example1;

public class RoadBikeFactory implements BikeFactory {

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
}
