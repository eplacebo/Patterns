package creational.abstractfactory.complex.complivite;

import creational.abstractfactory.complex.Jar;

public class JarComplivite implements Jar {
    @Override
    public void contains() {
        System.out.println("Содержит таблетки");
    }
}
