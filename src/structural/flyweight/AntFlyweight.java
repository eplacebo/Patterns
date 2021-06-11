package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AntFlyweight {
    private static final Map<String, Ant> ants = new HashMap<>();

    public Ant getAntByType(String typeAnt) {
        Ant ant = ants.get(typeAnt);

        if (ant == null) {
            switch (typeAnt) {
                case "рабочий":
                    System.out.println("Создается рабочий муравей");
                    ant = new WorkerAnt();
                    ants.put(typeAnt, ant);
                    break;
                case "летающий":
                    System.out.println("Создается летающий муравей");
                    ant = new FlyingAnt();
            }
            ants.put(typeAnt, ant);
        }
        return ant;
    }
}




