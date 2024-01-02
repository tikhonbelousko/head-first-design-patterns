public class SoldOutState implements State {
    GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Returning quarter, sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank, nothing happens");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense, sold out");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "Machine is run out of gumballs";
    }

}
