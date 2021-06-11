package structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Gun pistol = new Pistol(new ReloadBoxMagazin().openBoxMagazin());

        Gun machineGun = new MachineGun(new UnloadBoxMagazin().openBoxMagazin());
    }
}
