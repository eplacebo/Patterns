package behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        DoorBell doorBell = new DoorBell();

        Observer firstPet = new Pets("собака");
        Observer secondPet = new Pets("кошка");
        Observer thirdPet = new Pets("черепаха");

        doorBell.addObserver(firstPet);
        doorBell.addObserver(secondPet);
        doorBell.addObserver(thirdPet);

        doorBell.pushBell();

    }
}
