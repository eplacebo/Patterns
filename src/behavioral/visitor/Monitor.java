package behavioral.visitor;

public class Monitor implements ComputerElement{
    @Override
    public void working(Visitor visitor) {
        visitor.checkWork(this);
    }
}
