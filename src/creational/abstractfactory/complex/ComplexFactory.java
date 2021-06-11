package creational.abstractfactory.complex;

public interface ComplexFactory {
    Composition getComposition();

    Jar getJar();

    Form getForm();
}
