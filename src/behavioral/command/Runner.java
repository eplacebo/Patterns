package behavioral.command;

public class Runner {
    public static void main(String[] args) {
        Light light = new Light();
        Switch switchd = new Switch(new LightOutCommand(light),
                new LightUpCommand(light));

        light.lightOut();
        light.lightUp();
    }
}
