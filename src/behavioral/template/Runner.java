package behavioral.template;

public class Runner {
    public static void main(String[] args) {
     ComplexVitaminsTemplate omega = new Omega();
     omega.showSet();

        System.out.println("\n============================================\n");

     ComplexVitaminsTemplate creatine = new Creatine();
     creatine.showSet();
    }
}
