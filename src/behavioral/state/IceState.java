package behavioral.state;

public class IceState implements State {
    @Override
    public void changeState(Water water) {
        System.out.println("Состояние льда");
        water.setState(this);
    }
}
