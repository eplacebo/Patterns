package behavioral.command;

public class Switch {
    Command lightOut;
    Command lightUp;


    public Switch(Command lightOut, Command lightUp) {
        this.lightOut = lightOut;
        this.lightUp = lightUp;
    }

    public void switchOffLightOut(){
        lightOut.execute();
    }

    public void switchOnLightUp(){
        lightUp.execute();
    }
}
