public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Duck duck = new MullardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("\nTurkey says:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says:");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkey adapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nDuck adapter says:");
        duckAdapter.gobble();
        duckAdapter.fly();
        duckAdapter.fly();
        duckAdapter.fly();
        duckAdapter.fly();
        duckAdapter.fly();
    }
}
