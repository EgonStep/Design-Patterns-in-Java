package patterns.builder.example1;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {

        Bedroom room = new BedroomBuilder()
                .setDimension(new Dimension(1, 1))
                .setCeilingHeight(1).setFloorNumber(1)
                .setWallColor(Color.BLACK)
                .setNumberOfWindows(1)
                .setNumberOfDoors(1)
                .setIsDouble(false)
                .setHasEnsuite(true)
                .createBedroom();

        Kitchen kitchen = new KitchenBuilder()
                .setDimension(new Dimension(100, 200))
                .createKitchen();
    }
}
