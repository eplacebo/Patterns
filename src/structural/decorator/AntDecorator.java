package structural.decorator;

public class AntDecorator implements Ant {

    Ant ant;

    public AntDecorator(Ant ant) {
        this.ant = ant;
    }


    @Override
    public String doTask() {
        return ant.doTask();
    }
}
