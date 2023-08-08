public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Setup devices
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Command ceilingFanOnCommand = new CeilingFanMediumOnCommand(ceilingFan);
        Command ceilingOffCommand = new CeilingFanOffCommand(ceilingFan);


        Light light = new Light("Bed room");
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Setup remote control slots
        remoteControl.setCommand(0, ceilingFanOnCommand, ceilingOffCommand);
        remoteControl.setCommand(3, lightOnCommand, lightOffCommand);
        System.out.println(remoteControl);

        // Press buttons
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(3);
        System.out.println(remoteControl);

        // Undo everything
        System.out.println("Now let's undo things...\n");

        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        System.out.println(remoteControl);
    }
}
