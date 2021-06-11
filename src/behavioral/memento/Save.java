package behavioral.memento;

public class Save {
    private final String state;

    public Save(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
