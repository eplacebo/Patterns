package behavioral.command;

public class LightUpCommand implements Command {
    Light trafficLight;

    public LightUpCommand(Light trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void execute() {
        trafficLight.lightUp();
    }
}
