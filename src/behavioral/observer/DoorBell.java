package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class DoorBell implements Observed {
    List<Observer> pets = new ArrayList<>();

    public void pushBell() {
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        this.pets.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.pets.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:pets){
            observer.handleEvent("Дзынь дзынь, ");
        }
    }
}
