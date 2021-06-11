package creational.builder;

public class KomplivitComplex extends ComplexBuilder{
    @Override
    void buildName() {
        complex.setName("Компливит");
    }

    @Override
    void buildPills() {
        complex.setPills(90);
    }

    @Override
    void buildPrice() {
        complex.setPrice(30);
    }
}
