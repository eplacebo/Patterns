package behavioral.chain;

public class Main {
    public static void main(String[] args) {

        ChainOfResponsibility firstChain = new USDCurrencyHandler();
        ChainOfResponsibility secondChain = new EURCurrencyHandler();

        firstChain.nextChain(secondChain);
        secondChain.nextChain(firstChain);

        firstChain.requestProcess(new Currency("300 USD"));
        firstChain.requestProcess(new Currency("300 EUR"));
    }
}
