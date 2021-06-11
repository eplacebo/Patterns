package structural.composite;

public class Anthill {
    public static void main(String[] args) {
        Colony colony = new Colony();

        Ant antQueen = new AntQueen();

        Ant flyingAnt1 = new FlyingAnt();
        Ant flyingAnt2 = new FlyingAnt();

        Ant workerAnt1 = new WorkerAnt();
        Ant workerAnt2 = new WorkerAnt();
        Ant workerAnt3 = new WorkerAnt();


        colony.addAnt(antQueen);
        colony.addAnt(flyingAnt1);
        colony.addAnt(flyingAnt2);
        colony.addAnt(workerAnt1);
        colony.addAnt(workerAnt2);
        colony.addAnt(workerAnt3);

        colony.createColony();
    }
}
