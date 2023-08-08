public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light("Living room");
        Command lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("Home");
        Command garageDoorCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonWasPressed();
    }
}
