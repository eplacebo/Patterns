package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Ant workerAnt = new ProxyAnt();

        workerAnt.doTask();
    }
}
