package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        GaseousState gaseousState = new GaseousState();
        gaseousState.changeState(water);
        IceState iceState = new IceState();
        iceState.changeState(water);
        LiquidState liquidState = new LiquidState();
        liquidState.changeState(water);
    }
}