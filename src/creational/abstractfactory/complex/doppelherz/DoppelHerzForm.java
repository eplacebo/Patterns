package creational.abstractfactory.complex.doppelherz;

import creational.abstractfactory.complex.Form;

public class DoppelHerzForm implements Form {
    @Override
    public void showTypeForm() {
        System.out.println("Тип полиненасыщенные жиры");
    }
}
