public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\nMaking a tea:");
        tea.prepareRecipe();

        System.out.println("\nMaking a coffee:");
        coffee.prepareRecipe();
    }
}
