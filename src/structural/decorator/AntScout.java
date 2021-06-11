package structural.decorator;

public class AntScout extends AntDecorator {
    public AntScout(Ant ant) {
        super(ant);
    }

    public String searchFood(){
        return " ищет пищу";
    }

    @Override
    public String doTask() {
        return super.doTask()+searchFood();
    }
}
