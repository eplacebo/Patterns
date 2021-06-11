package behavioral.template;

public abstract class ComplexVitaminsTemplate {
    public void showSet(){
        System.out.println("Банка витаминов");
        System.out.println("В банке капсулы");
        showCapsule();
    }

    public abstract void showCapsule();
}
