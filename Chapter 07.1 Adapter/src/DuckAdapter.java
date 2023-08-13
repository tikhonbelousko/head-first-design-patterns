public class DuckAdapter implements Turkey {
    Duck duck;
    int flyCounter = 0;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        flyCounter = (flyCounter + 1) % 5;

        if (flyCounter == 0) {
            System.out.println("I fly every fifth time...");
        }
    }
}
