package creational.factorymethod;

public class MagnesiumVitaminFactory implements VitaminFactory{
    @Override
    public Vitamin createVitamin() {
        return new MagnesiumVitamin();
    }
}
