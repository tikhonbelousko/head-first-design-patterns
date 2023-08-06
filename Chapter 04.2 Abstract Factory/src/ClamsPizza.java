public class ClamsPizza extends Pizza {
    PizzaIngridentsFactory ingridentsFactory;

    public ClamsPizza(PizzaIngridentsFactory ingridentsFactory) {
        this.ingridentsFactory = ingridentsFactory;
    }

    public void prepare() {
        System.out.println("Baking " + name);
        dough = ingridentsFactory.createDough();
        sauce = ingridentsFactory.createSauce();
        clams = ingridentsFactory.createClams();
    }
}
