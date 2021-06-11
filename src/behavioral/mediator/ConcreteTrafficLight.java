package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTrafficLight implements Mediator {

    List<Signal> signalList = new ArrayList<>();

    void add(Signal signal) {
        signalList.add(signal);
    }

    @Override
    public void requestAll(Signal signal) {
        signal.setTrue();
        for (Signal sig : signalList) {
            if (sig != signal) {
                sig.setFalse();
            }
        }
    }
}
