package behavioral.visitor;

public class Keyboard implements ComputerElement {
    @Override
    public void working(Visitor visitor) {
        visitor.checkWork(this);
    }
}
