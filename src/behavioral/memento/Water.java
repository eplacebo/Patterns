package behavioral.memento;

public class Water {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Save save() {
        return new Save(state);
    }

    public void load(Save save) {
        state = save.getState();
    }

    @Override
    public String toString() {
        return "Water{" +
                "state='" + state + '\'' +
                '}';
    }
}
