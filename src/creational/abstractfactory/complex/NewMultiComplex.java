package creational.abstractfactory.complex;


import creational.abstractfactory.complex.complivite.CompliviteComplexFactory;
import creational.abstractfactory.complex.doppelherz.DoppelHerzComplexFactory;

public class NewMultiComplex {
    public static void main(String[] args) {
        ComplexFactory complexFactory = new CompliviteComplexFactory();
        ComplexFactory complexFactory1 = new DoppelHerzComplexFactory();
        Jar jar = complexFactory.getJar();
        Composition composition = complexFactory.getComposition();
        Composition composition1 = complexFactory1.getComposition();
        Form form = complexFactory.getForm();
        Form form1 = complexFactory1.getForm();

        System.out.println("Новый мультикомплекс:");
        jar.contains();
        composition.showComposition();
        composition1.showComposition();
        form.showTypeForm();
        form1.showTypeForm();
    }
}
