package behavioral.strategy;

public class LiquidState implements State {
    @Override
    public void changeState() {
        System.out.println("Состояние жидкости");
    }
}
