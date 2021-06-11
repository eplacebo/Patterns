package behavioral.state;

public class LiquidState implements State {
    @Override
    public void changeState(Water water) {
        System.out.println("Состояние жидкости");
        water.setState(this);
    }
}
