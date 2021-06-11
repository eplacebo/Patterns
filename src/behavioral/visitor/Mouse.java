package behavioral.visitor;

public class Mouse implements ComputerElement {
    @Override
    public void working(Visitor visitor) {
        visitor.checkWork(this);
    }
}
