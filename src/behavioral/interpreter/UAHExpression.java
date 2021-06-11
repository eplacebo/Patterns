package behavioral.interpreter;

public class UAHExpression implements Expression {
    private int number;

    public UAHExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Contex contex) {
        return contex.getUAH(number);
    }
}
