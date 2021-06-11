package behavioral.mediator;

public class ConcreteSignal implements Signal {
    boolean signal;
    Mediator mediator;
    String color;


    public ConcreteSignal(Mediator mediator, String color) {
        this.mediator = mediator;
        this.color = color;
    }

    @Override
    public void setFalse() {
        signal = false;
        System.out.println(color + " не горит");
    }

    @Override
    public void setTrue() {
        signal = true;
        System.out.println(color + " горит");
    }

    @Override
    public void changeColor() {
        mediator.requestAll(this);
    }
}
