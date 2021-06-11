package behavioral.interpreter;

public class USDExpression implements Expression {
    private int number;

    public USDExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Contex contex) {
        return contex.getUSD(number);
    }
}
