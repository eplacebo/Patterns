package creational.builder;

public class Machine {
    ComplexBuilder complexBuilder;

    public void setComplexBuilder(ComplexBuilder complexBuilder) {
        this.complexBuilder = complexBuilder;
    }

    Complex buildComplex() {
        complexBuilder.createComplex();
        complexBuilder.buildName();
        complexBuilder.buildPills();
        complexBuilder.buildPrice();

        Complex complex = complexBuilder.getComplex();

        return complex;
    }
}
