package structural.bridge;

public class ReloadBoxMagazin implements BoxMagazin {
    @Override
    public BoxMagazin openBoxMagazin() {
        System.out.println("Вытащить магазин: зарядить патроны");
        return new ReloadBoxMagazin();
    }
}
