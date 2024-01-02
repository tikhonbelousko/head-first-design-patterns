public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter is already inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting a quarter...");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {
        System.out.println("Turning the crank...");

        if ((Math.random() >= 0.9) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Machine has quarter inserted";
    }
}
