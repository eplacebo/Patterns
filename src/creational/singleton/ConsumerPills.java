package creational.singleton;

public class ConsumerPills {
    public static void main(String[] args) {
        JarOfPills.getJarOfPills().showPills();
        JarOfPills.getJarOfPills().usePill();
        System.out.println("Потребитель выпивает пилюлю");
        JarOfPills.getJarOfPills().showPills();
    }
}
