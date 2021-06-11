package creational.abstractfactory.complex.doppelherz;

import creational.abstractfactory.complex.Jar;

public class DoppelHerzJar implements Jar {
    @Override
    public void contains() {
        System.out.println("Содержит капсулы");
    }
}
