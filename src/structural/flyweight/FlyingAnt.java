package structural.flyweight;

public class FlyingAnt implements Ant {
    @Override
    public void doTask() {
        System.out.println("Летающий муравей ищет новое место");
    }
}
