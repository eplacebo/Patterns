package structural.flyweight;

public class WorkerAnt implements Ant{
    @Override
    public void doTask() {
        System.out.println("Рабочий муравей строит");
    }
}
