public class MenuItem extends MenuComponent {
    private final String name;
    private final String description;
    private final boolean isVegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print(" 🌱");
        }
        System.out.println(", $" + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
