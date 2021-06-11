package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ComputerElement computerElement = new Computer();
        computerElement.working(new Status());
    }
}
