package patterns.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Rabbit implements Cloneable {
    
    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    @Override
    public Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
