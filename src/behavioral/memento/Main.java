package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        SaveRepo repo = new SaveRepo();
        Water water = new Water();
        water.setState("Лёд");
        System.out.println(water);
        System.out.println("Сохранение состояния");
        repo.setSave(water.save());
        System.out.println("Изменение температуры с -1 до +1 градусов");
        water.setState("Жидкость");
        System.out.println(water);
        System.out.println("Rollback");
        water.load(repo.getSave());
        System.out.println(water);
    }
}
