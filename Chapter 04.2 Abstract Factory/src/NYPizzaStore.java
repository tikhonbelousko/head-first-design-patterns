public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngridentsFactory ingridientsFactory = new NYPizzaIngridientsFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingridientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clams")) {
            pizza = new ClamsPizza(ingridientsFactory);
            pizza.setName("New York Style Clams Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingridientsFactory);
            pizza.setName("New York Style Veggie Pizza ");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingridientsFactory);
            pizza.setName("New York Style Pepperoni Pizza ");
        }

        return pizza;
    }
}
