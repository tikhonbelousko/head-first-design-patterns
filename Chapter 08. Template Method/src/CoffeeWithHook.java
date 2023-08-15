import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = "no";

        System.out.println("Would you like some sugar in your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO Error trying to read the answer");
        }

        return answer;
    }
}
