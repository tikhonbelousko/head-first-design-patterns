import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int length;
    private int currentIndex = 0;

    public DinerMenuIterator(MenuItem[] menuItems, int length) {
        this.menuItems = menuItems;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < length;
    }

    @Override
    public MenuItem next() {
        return menuItems[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
