package creational.abstractfactory.complex.complivite;

import creational.abstractfactory.complex.ComplexFactory;
import creational.abstractfactory.complex.Composition;
import creational.abstractfactory.complex.Jar;
import creational.abstractfactory.complex.Form;

public class CompliviteComplexFactory implements ComplexFactory {
    @Override
    public Composition getComposition() {
        return new CompositionComplivite();
    }

    @Override
    public Jar getJar() {
        return new JarComplivite();
    }

    @Override
    public Form getForm() {
        return new FormComplivite();
    }
}
