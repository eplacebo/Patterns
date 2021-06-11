package creational.factorymethod;

public class CalciumVitaminFactory implements VitaminFactory {
    @Override
    public Vitamin createVitamin() {
        return new CalciumVitamin();
    }
}
