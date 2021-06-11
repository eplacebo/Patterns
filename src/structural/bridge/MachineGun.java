package structural.bridge;

public class MachineGun extends Gun {
    public MachineGun(BoxMagazin boxMagazin) {
        super(boxMagazin);
    }

    @Override
    BoxMagazin openBoxMagazin() {
        System.out.print("Извлечь магазин автомата");
        return boxMagazin;
    }
}
