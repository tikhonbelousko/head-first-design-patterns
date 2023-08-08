public class RemoteLoaderMacro {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Setup devices
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Command ceilingFanOn = new CeilingFanMediumOnCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Light light = new Light("Living room");
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Stereo stereo = new Stereo("Living room");
        Command stereoOn = new StereoOnCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { ceilingFanOn, lightOn, stereoOn };
        Command[] partyOff = { ceilingFanOff, lightOff, stereoOff };

        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        // Setup remote control slots
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);

        // Press buttons
        remoteControl.onButtonPressed(5);

        System.out.println("\nNow turning off.\n");

        remoteControl.offButtonPressed(5);
        System.out.println(remoteControl);

        // Undo everything
        System.out.println("Now let's undo one command, it should turn everything back on.\n");
        remoteControl.undoButtonPressed();
        System.out.println(remoteControl);
    }
}
