package creational.factorymethod;

public class OmegaVitaminFactory implements VitaminFactory {
    @Override
    public Vitamin createVitamin() {
        return new OmegaVitamin();
    }
}
