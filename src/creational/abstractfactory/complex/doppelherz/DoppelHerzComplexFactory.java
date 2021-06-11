package creational.abstractfactory.complex.doppelherz;

import creational.abstractfactory.complex.ComplexFactory;
import creational.abstractfactory.complex.Composition;
import creational.abstractfactory.complex.Form;
import creational.abstractfactory.complex.Jar;

public class DoppelHerzComplexFactory implements ComplexFactory {
    @Override
    public Composition getComposition() {
        return new DoppelHerzComposition();
    }

    @Override
    public Jar getJar() {
        return new DoppelHerzJar();
    }

    @Override
    public Form getForm() {
        return new DoppelHerzForm();
    }
}
