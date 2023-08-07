public class Chocoholic {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.UNIQUE_INSTANCE;

        chocolateBoiler.fill();
        System.out.println("Filling in...");
        System.out.println(" - empty: " + chocolateBoiler.isEmpty());
        System.out.println(" - boiled: " + chocolateBoiler.isBoiled());
        System.out.println();

        chocolateBoiler.boil();
        System.out.println("Boiling...");
        System.out.println(" - empty: " + chocolateBoiler.isEmpty());
        System.out.println(" - boiled: " + chocolateBoiler.isBoiled());
        System.out.println();

        chocolateBoiler.drain();
        System.out.println("Draining...");
        System.out.println(" - empty: " + chocolateBoiler.isEmpty());
        System.out.println(" - boiled: " + chocolateBoiler.isBoiled());
        System.out.println();
    }
}
