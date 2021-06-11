package creational.builder;

public abstract class ComplexBuilder {
    Complex complex;

    void createComplex() {
        complex = new Complex();
    }

    abstract void buildName();

    abstract void buildPills();

    abstract void buildPrice();

    Complex getComplex() {
        return complex;
    }

}
