public class VeggiePizza extends Pizza {
    PizzaIngridentsFactory ingridentsFactory;

    public VeggiePizza(PizzaIngridentsFactory ingridentsFactory) {
        this.ingridentsFactory = ingridentsFactory;
    }

    public void prepare() {
        System.out.println("Baking " + name);
        dough = ingridentsFactory.createDough();
        sauce = ingridentsFactory.createSauce();
        veggies = ingridentsFactory.createVeggies();
    }
}
