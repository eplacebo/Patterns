package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AntFlyweight antFlyweight = new AntFlyweight();

        List<Ant> antList = new ArrayList<>();

        antList.add(antFlyweight.getAntByType("рабочий"));
        antList.add(antFlyweight.getAntByType("рабочий"));
        antList.add(antFlyweight.getAntByType("рабочий"));
        antList.add(antFlyweight.getAntByType("летающий"));
        antList.add(antFlyweight.getAntByType("летающий"));

        for (Ant ant : antList) {
            ant.doTask();
        }
    }
}
