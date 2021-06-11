package creational.prototype;

public class Runner {
    public static void main(String[] args) {
        Tablet komplivit = new Tablet("Компливит", 30);

        System.out.println(komplivit);


        TabletFactory tabletFactory = new TabletFactory(komplivit);
        Tablet masterClone = tabletFactory.cloneTablet();
        System.out.println(masterClone);
    }
}
