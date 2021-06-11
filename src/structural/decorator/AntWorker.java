package structural.decorator;

public class AntWorker extends AntDecorator{
    public AntWorker(Ant ant) {
        super(ant);
    }

    public String buildAnthill(){
        return " строит муравейник";
    }

    @Override
    public String doTask() {
        return super.doTask()+buildAnthill();
    }
}
