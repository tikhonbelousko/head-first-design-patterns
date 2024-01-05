package gumball;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    @Serial
    private static final long serialVersionUID = 2L;

    private State noQuarterState = new NoQuarterState(this);
    private State hasQuarterState = new HasQuarterState(this);
    private State soldState = new SoldState(this);
    private State soldOutState = new SoldOutState(this);
    private State winnerState = new WinnerState(this);
    private State state;
    private int count;
    private String location;

    public GumballMachine(int numberOfGumballs, String location) throws RemoteException {
        this.count = numberOfGumballs;
        this.location = location;

        if (count == 0) {
            state = soldOutState;
        } else {
            state = noQuarterState;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getWinnerState() {
        return winnerState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count -= 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled. The new gumball count is " + this.count);
        this.state.refill();
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory: " + count + " gumballs\n" +
                state + "\n";
    }
}
