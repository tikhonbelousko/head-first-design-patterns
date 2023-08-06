public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngridentsFactory ingridientsFactory = new ChicagoPizzaIngridientsFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingridientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clams")) {
            pizza = new ClamsPizza(ingridientsFactory);
            pizza.setName("Chicago Style Clams Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingridientsFactory);
            pizza.setName("Chicago Style Veggie Pizza ");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingridientsFactory);
            pizza.setName("Chicago Style Pepperoni Pizza ");
        }

        return pizza;
    }
}
