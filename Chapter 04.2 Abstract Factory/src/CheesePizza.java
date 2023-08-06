public class CheesePizza extends Pizza {
    PizzaIngridentsFactory ingridentsFactory;

    public CheesePizza(PizzaIngridentsFactory ingridentsFactory) {
        this.ingridentsFactory = ingridentsFactory;
    }

    public void prepare() {
        System.out.println("Baking " + name);
        dough = ingridentsFactory.createDough();
        sauce = ingridentsFactory.createSauce();
        cheese = ingridentsFactory.createCheese();
    }
}
