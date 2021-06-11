package behavioral.state;

public class GaseousState implements State{
    @Override
    public void changeState(Water water) {
        System.out.println("Газообразное состояние");
        water.setState(this);
    }
}
