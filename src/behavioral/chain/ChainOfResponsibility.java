package behavioral.chain;

public interface ChainOfResponsibility {
    void nextChain(ChainOfResponsibility nextChain);
    void requestProcess(Currency currency);
}
