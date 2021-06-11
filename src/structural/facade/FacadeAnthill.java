package structural.facade;

public class FacadeAnthill {
    Colony colony;
    Ant antQueen;
    Ant flyingAnt1;
    Ant flyingAnt2;
    Ant workerAnt1;
    Ant workerAnt2;
    Ant workerAnt3;

    public FacadeAnthill() {
        this.colony = new Colony();
        this.antQueen = new AntQueen();
        this.flyingAnt1 = new FlyingAnt();
        this.flyingAnt2 = new FlyingAnt();
        this.workerAnt1 = new WorkerAnt();
        this.workerAnt2 = new WorkerAnt();
        this.workerAnt3 = new WorkerAnt();
    }

    public void buildAnthill() {
        System.out.println("Строим..");
        colony.addAnt(antQueen);
        colony.addAnt(flyingAnt1);
        colony.addAnt(flyingAnt2);
        colony.addAnt(workerAnt1);
        colony.addAnt(workerAnt2);
        colony.addAnt(workerAnt3);
        colony.createColony();
    }
}
