package behavioral.chain;

public class USDCurrencyHandler implements ChainOfResponsibility{

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Currency currency) {
        if(currency.getCurrency().contains("USD")){
            System.out.println("Доллары: "+currency.getCurrency());
        } else {
            chain.requestProcess(currency);
        }
    }
}
