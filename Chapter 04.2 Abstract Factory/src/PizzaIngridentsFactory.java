public interface PizzaIngridentsFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Cheese createCheese();
    public Clams createClams();
    public Pepperoni createPepperoni();
}
