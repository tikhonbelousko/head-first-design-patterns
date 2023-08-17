import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem(
                "Veggie Burger",
                "Burger with tomato and cucumber",
                true,
                2.99
        );

        addItem(
                "Soup of the day",
                "Tasty soup with veggies",
                true,
                1.99
        );

        addItem(
                "Burrito",
                "Amazing burrito",
                false,
                5.99
        );

        addItem(
                "Taco with chicken",
                "Two tacos with soft chicken breasts and cheese sauce",
                false,
                2.49
        );
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, isVegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
