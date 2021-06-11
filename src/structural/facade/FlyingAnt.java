package structural.facade;

public class FlyingAnt implements Ant {
    @Override
    public void doTask() {
        System.out.println("Летающий муравей ищет место для нового муравейника");
    }
}
