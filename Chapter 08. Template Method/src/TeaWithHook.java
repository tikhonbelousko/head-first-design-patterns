import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Brewing tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = "no";

        System.out.println("Would you like a lemon in your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO Error trying to read the answer");
        }

        return answer;
    }
}
