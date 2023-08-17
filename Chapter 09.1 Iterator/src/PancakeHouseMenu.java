import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();

        menuItems.add(new MenuItem(
                "Pancake with jam",
                "Sweet pancakes",
                true,
                2.99
        ));

        menuItems.add(new MenuItem(
                "Pancake with minced meat",
                "Pancake and caviar served with sour cream",
                false,
                4.99
        ));

        menuItems.add(new MenuItem(
                "Plain pancakes",
                "Just plain and simple pancakes",
                true,
                1.99
        ));

        menuItems.add(new MenuItem(
                "Pancake with caviar",
                "Pancake and caviar served with sour cream",
                false,
                6.99
        ));
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
