package behavioral.command;

public class LightOutCommand implements Command{
    Light trafficLight;

    public LightOutCommand(Light trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void execute() {
        trafficLight.lightOut();
    }
}
