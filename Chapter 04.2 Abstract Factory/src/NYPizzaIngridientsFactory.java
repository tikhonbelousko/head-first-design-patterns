public class NYPizzaIngridientsFactory implements PizzaIngridentsFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Onion(), new Garlic(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
