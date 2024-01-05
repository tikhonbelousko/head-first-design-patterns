package gumball;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://london.mightygumball.com/gumball-machine",
                "rmi://newyork.mightygumball.com/gumball-machine",
                "rmi://lisbon.mightygumball.com/gumball-machine",
        };

        if (args.length >= 1) {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumball-machine";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor gumballMonitor : monitor) {
            gumballMonitor.report();
        }
    }
}

