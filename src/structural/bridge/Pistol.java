package structural.bridge;

public class Pistol  extends Gun {
    public Pistol(BoxMagazin boxMagazin) {
        super(boxMagazin);
    }

    @Override
    BoxMagazin openBoxMagazin() {
        System.out.println("Вытащить магазин пистолета");
        return boxMagazin;
    }
}
