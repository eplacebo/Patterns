package behavioral.visitor;

public interface Visitor {
    void checkWork(Keyboard keyboard);

    void checkWork(Monitor monitor);

    void checkWork(Mouse mouse);
}
