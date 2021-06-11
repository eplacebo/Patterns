package behavioral.visitor;

public class Status implements Visitor{
    @Override
    public void checkWork(Keyboard keyboard) {
        System.out.println("Клавиатура в работе");
    }

    @Override
    public void checkWork(Monitor monitor) {
        System.out.println("Монитор в работе");
    }

    @Override
    public void checkWork(Mouse mouse) {
        System.out.println("Мышь в работе");
    }
}
