package creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class JarOfPills {
    private static JarOfPills jarOfPills;
    private static AtomicInteger pills = new AtomicInteger(30);

    public static JarOfPills getJarOfPills() {
        if (jarOfPills == null) {
            jarOfPills = new JarOfPills();
        }
        return jarOfPills;
    }

    public int usePill() {
        if (pills.get() == 0) {
            System.out.println("Банка закончилась");
        }
        return pills.getAndDecrement();
    }

    public void showPills() {
        System.out.println(pills.get());
    }
}
