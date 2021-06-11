package behavioral.strategy;

public class GaseousState implements State {
    @Override
    public void changeState() {
        System.out.println("Газообразное состояние");
    }
}
