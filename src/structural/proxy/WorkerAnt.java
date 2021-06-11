package structural.proxy;

public class WorkerAnt implements Ant{
    @Override
    public void doTask() {
        System.out.println("Рабочий муравей строит муравейник");
    }
}
