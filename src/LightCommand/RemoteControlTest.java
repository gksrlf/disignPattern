package LightCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SImpleRemoteControl remote = new SImpleRemoteControl();
        Light light = new Light("zz");
        GarageDoor garageDoor = new GarageDoor("zz");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
