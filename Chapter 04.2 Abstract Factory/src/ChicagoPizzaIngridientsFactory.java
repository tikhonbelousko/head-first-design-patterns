public class ChicagoPizzaIngridientsFactory implements PizzaIngridentsFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Spinach(), new BlackOlives(), new Eggplant() };
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
