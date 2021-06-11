package behavioral.chain;

public class EURCurrencyHandler implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }


    @Override
    public void requestProcess(Currency currency) {
        if (currency.getCurrency().contains("EUR")) {
            System.out.println("Евро: " + currency.getCurrency());
        } else {
            chain.requestProcess(currency);
        }
    }
}
