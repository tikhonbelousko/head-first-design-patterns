import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undoCommands = new Stack<Command>();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoButtonPressed() {
        if (undoCommands.isEmpty()) return;

        Command command = undoCommands.pop();
        command.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n --- Remote control --- \n");
        for (int i = 0; i < 7; i++) {
            stringBuffer.append("[slot " + i + "] "
                    + onCommands[i].getClass().getName() + "\t\t\t"
                    + offCommands[i].getClass().getName() + "\n");
        }

        for (Command command : undoCommands) {
            stringBuffer.append("[undo] " + command.getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
