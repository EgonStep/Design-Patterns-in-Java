package patterns.factory_abstract.example2;

public class BikeBuilder {
    public static void main(String[] args) {

        /**
         *  Implement Extensible Factories
         *  It is now much easier to add BikeParts, but there`s a trade-off.
         *  We need to cast to the correct object. Because the reliance is placed on
         *  BikeBuilder to return the correct type.
         */
        BikeFactory bikeFactory = FactoryCreator.createFactory("road bike");

        Tire tireFront = (Tire) bikeFactory.create("tire");
        Tire tireBack = (Tire) bikeFactory.create("tire");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");

        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();
    }
}
