package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        VitaminFactory vitaminFactory = createVitaminFactoryByType("омега");
        Vitamin vitamin = vitaminFactory.createVitamin();

        vitamin.identificationVitamin();
    }

    static VitaminFactory createVitaminFactoryByType(String typeVitamin) {
        if (typeVitamin.equalsIgnoreCase("омега")) {
            return new OmegaVitaminFactory();
        } else if (typeVitamin.equalsIgnoreCase("кальций")) {
            return new CalciumVitaminFactory();
        } else if (typeVitamin.equalsIgnoreCase("магний")) {
            return new MagnesiumVitaminFactory();
        } else {
            throw new RuntimeException(typeVitamin + " не существует");
        }
    }
}
