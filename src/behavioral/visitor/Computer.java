package behavioral.visitor;

public class Computer implements ComputerElement {
    ComputerElement[] computerElements;

    public Computer(){
        this.computerElements = new ComputerElement[]{
                new Keyboard(),
                new Mouse(),
                new Monitor()
        };
    }


    @Override
    public void working(Visitor visitor) {
        for (ComputerElement computerElement: computerElements) {
            computerElement.working(visitor);
        }
    }
}
