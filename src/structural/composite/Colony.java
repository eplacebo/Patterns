package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colony {
    private List<Ant> ants = new ArrayList<Ant>();

    public void addAnt(Ant ant) {
        ants.add(ant);
    }

    public void removeAnt(Ant ant) {
        ants.remove(ant);
    }

    public void createColony() {
        System.out.println("Колония создана.. \n");

        for (Ant ant : ants) {
            ant.doTask();
        }
    }

}
