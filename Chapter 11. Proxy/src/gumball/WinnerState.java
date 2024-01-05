package gumball;

import java.io.Serial;

public class WinnerState implements State {
    @Serial
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you are already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
            return;
        }

        gumballMachine.releaseBall();
        System.out.println("YOU ARE A WINNER! You got two gumballs for one quarter");

        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops... Out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Machine is found the winner";
    }
}
