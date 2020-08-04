package patterns.prototype;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.setOwner(new Person("Sally"));
        Rabbit rabbitCopy = rabbit.clone();

        System.out.println("Name of first owner " + rabbit.getOwner().getName());
        System.out.println("Name of copy owner " + rabbitCopy.getOwner().getName());

        rabbitCopy.getOwner().setName("Steve");

        System.out.println("Name of first owner " + rabbit.getOwner().getName());
        System.out.println("Name of copy owner " + rabbitCopy.getOwner().getName());
    }
}
