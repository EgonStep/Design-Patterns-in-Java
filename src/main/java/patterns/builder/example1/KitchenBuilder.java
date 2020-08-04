package patterns.builder.example1;

import java.awt.*;

public class KitchenBuilder implements Builder {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public KitchenBuilder() {
    }

    @Override
    public KitchenBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public KitchenBuilder setHasDishwasher(boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
        return this;
    }

    public KitchenBuilder setHasMicrowave(boolean hasMicrowave) {
        this.hasMicrowave = hasMicrowave;
        return this;
    }

    public Kitchen createKitchen() {
        return new Kitchen(dimension, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors,
                hasDishwasher, hasMicrowave);
    }
}