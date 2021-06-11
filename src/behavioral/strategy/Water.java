package behavioral.strategy;

public class Water {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void executeState(){
        state.changeState();
    }
}
