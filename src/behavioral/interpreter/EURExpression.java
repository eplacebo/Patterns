package behavioral.interpreter;

public class EURExpression implements Expression {
    private int number;

    public EURExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Contex contex) {
        return Integer.toString(number/90);
    }
}
