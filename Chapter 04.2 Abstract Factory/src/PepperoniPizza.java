public class PepperoniPizza extends Pizza {
    PizzaIngridentsFactory ingridentsFactory;

    public PepperoniPizza(PizzaIngridentsFactory ingridentsFactory) {
        this.ingridentsFactory = ingridentsFactory;
    }

    public void prepare() {
        System.out.println("Baking " + name);
        dough = ingridentsFactory.createDough();
        sauce = ingridentsFactory.createSauce();
        pepperoni = ingridentsFactory.createPepperoni();
    }
}
