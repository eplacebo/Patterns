package creational.builder;

public class OmegaComplex extends ComplexBuilder {
    @Override
    void buildName() {
        complex.setName("Омега 3-6-9");
    }

    @Override
    void buildPills() {
        complex.setPills(30);
    }

    @Override
    void buildPrice() {
        complex.setPrice(67);
    }
}
