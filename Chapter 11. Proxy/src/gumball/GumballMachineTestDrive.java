package gumball;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]) ;
            gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind ("//" + args[0] + "/gumball-machine", gumballMachine) ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
