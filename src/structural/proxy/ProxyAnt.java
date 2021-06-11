package structural.proxy;

public class ProxyAnt implements Ant {
    private WorkerAnt workerAnt;

    @Override
    public void doTask() {
        if (workerAnt == null) {
            workerAnt = new WorkerAnt();
        }

        workerAnt.doTask();
        System.out.println("И охраняет его");
    }
}
