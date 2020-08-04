package patterns.factory_abstract.example1;

public class MountainBikeFactory implements BikeFactory {

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
}
