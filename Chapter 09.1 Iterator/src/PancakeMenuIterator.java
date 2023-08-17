import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PancakeMenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> menuItems;
    private int currentIndex = 0;

    public PancakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.size();
    }

    @Override
    public MenuItem next() throws NoSuchElementException {
        return menuItems.get(currentIndex++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
