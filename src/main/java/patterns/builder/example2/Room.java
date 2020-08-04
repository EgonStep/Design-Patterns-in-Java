package patterns.builder.example2;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
public class Room {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(Dimension dimension, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
                int numberOfDoors) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }
}
