package creational.abstractfactory.complex.doppelherz;

import creational.abstractfactory.complex.Composition;

public class DoppelHerzComposition implements Composition {
    @Override
    public void showComposition() {
        System.out.println("В составе: Омега 3-6-9..");
    }
}
