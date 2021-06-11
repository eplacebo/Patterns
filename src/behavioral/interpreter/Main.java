package behavioral.interpreter;

public class Main {

    private Contex contex;

    public Main(Contex contex) {
        this.contex = contex;
    }

    public static void main(String[] args) {
        Contex contex;

        String usd = "300 RUB to USD: ";
        String uah = "300 RUB to UAH: ";
        String eur = "300 RUB to EUR: ";

        Main expression = new Main(new Contex());

        System.out.println(usd+expression.interpret(usd));
        System.out.println(uah+expression.interpret(uah));
        System.out.println(eur+expression.interpret(eur));

    }

    private String interpret(String text) {
        Expression expression;

        if (text.contains("USD")) {
            expression = new USDExpression(Integer.parseInt(text.substring(0, text.indexOf(" "))));
        } else if (text.contains("UAH")) {
            expression = new UAHExpression(Integer.parseInt(text.substring(0, text.indexOf(" "))));
        } else if (text.contains("EUR")) {
            expression = new EURExpression(Integer.parseInt(text.substring(0, text.indexOf(" "))));

        } else {
            return text;
        }
        return expression.interpret(contex);
    }
}

