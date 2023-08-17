import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem(
                "Hotdog",
                "Nice Hotdog with ketchup in mustard",
                false,
                1.99
        );

        addItem(
                "Cookie",
                "Fresh cookie",
                true,
                0.99
        );

        addItem(
                "Hamburger",
                "Just like in McDonalds",
                false,
                2.99
        );

        addItem(
                "Fries",
                "Fries with ketchup",
                true,
                0.89
        );
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, the menu is full");
            return;
        }

        menuItems[numberOfItems] = new MenuItem(name, description, isVegetarian, price);
        numberOfItems++;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems, numberOfItems);
    }
}
