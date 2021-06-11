package structural.bridge;

public class UnloadBoxMagazin implements BoxMagazin {
    @Override
    public BoxMagazin openBoxMagazin() {
        System.out.println("Вытащить магазин: извлечь патроны");
        return new UnloadBoxMagazin();
    }
}
