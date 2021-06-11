package structural.bridge;

public abstract class Gun {
    BoxMagazin boxMagazin;

    public Gun(BoxMagazin boxMagazin) {
        this.boxMagazin = boxMagazin;
    }

    abstract BoxMagazin openBoxMagazin();
}
