package patterns.factory_abstract.example1;

public class BikeBuilder {

    public static void main(String[] args) {
        BikeFactory bikeFactory = FactoryCreator.createFactory("road bike");

        if (bikeFactory != null) {
            Tire tireFront = bikeFactory.createTire();
            Tire tireBack = bikeFactory.createTire();
            Handlebar handlebar = bikeFactory.createHandlebar();

            tireFront.getDescription();
            tireFront.getDescription();
            tireBack.getDescription();
            handlebar.getDescription();
        }
    }
}
