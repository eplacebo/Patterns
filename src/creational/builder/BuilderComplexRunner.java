package creational.builder;

public class BuilderComplexRunner {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.setComplexBuilder(new OmegaComplex());
        Complex complex = machine.buildComplex();

        System.out.println(complex);
    }
}
