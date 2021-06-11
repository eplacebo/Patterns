package structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Ant ant = new AntWorker(new AntScout(new AntFlying()));
        System.out.println(ant.doTask());
    }
}
