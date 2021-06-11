package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();

        water.setState(new IceState());
        water.executeState();

        water.setState(new LiquidState());
        water.executeState();

        water.setState(new GaseousState());
        water.executeState();
    }
}