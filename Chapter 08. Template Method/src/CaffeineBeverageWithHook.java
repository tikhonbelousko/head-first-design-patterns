public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring in a cup...");
    }

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
         return true;
    }
}
