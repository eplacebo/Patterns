package behavioral.strategy;

public class IceState implements State {
    @Override
    public void changeState() {
        System.out.println("Состояние льда");
    }
}
