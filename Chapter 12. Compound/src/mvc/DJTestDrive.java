package mvc;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface beatModel = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(beatModel);
    }
}
