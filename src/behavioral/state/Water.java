package behavioral.state;

public class Water {
    private State state;


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
