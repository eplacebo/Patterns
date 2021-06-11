package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteTrafficLight mediator = new ConcreteTrafficLight();
        mediator.add(new ConcreteSignal(mediator, "Желтый"));
        mediator.add(new ConcreteSignal(mediator, "Зеленый"));
        ConcreteSignal concreteSignal = new ConcreteSignal(mediator, "Красный");
        concreteSignal.changeColor();
    }
}
