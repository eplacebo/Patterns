package behavioral.observer;

public class Pets implements Observer {
    String name;

    public Pets(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String soundBell) {
        System.out.println(soundBell + name + " услышала звонок в дверь.");
    }
}
