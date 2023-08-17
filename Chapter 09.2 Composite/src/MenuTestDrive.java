import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("MENU", "All menus");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem(
                "Pancake with jam",
                "Sweet pancakes",
                true,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Pancake with minced meat",
                "Pancake and caviar served with sour cream",
                false,
                4.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Plain pancakes",
                "Just plain and simple pancakes",
                true,
                1.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Pancake with caviar",
                "Pancake and caviar served with sour cream",
                false,
                6.99
        ));
        allMenus.add(pancakeHouseMenu);

        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        dinerMenu.add(new MenuItem(
                "Hotdog",
                "Nice Hotdog with ketchup in mustard",
                false,
                1.99
        ));
        dinerMenu.add(new MenuItem(
                "Cookie",
                "Fresh cookie",
                true,
                0.99
        ));
        dinerMenu.add(new MenuItem(
                "Hamburger",
                "Just like in McDonalds",
                false,
                2.99
        ));
        dinerMenu.add(new MenuItem(
                "Fries",
                "Fries with ketchup",
                true,
                0.89
        ));
        allMenus.add(dinerMenu);

        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        cafeMenu.add(new MenuItem(
                "Veggie Burger",
                "Burger with tomato and cucumber",
                true,
                2.99
        ));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "Tasty soup with veggies",
                true,
                1.99
        ));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "Amazing burrito",
                false,
                5.99
        ));
        cafeMenu.add(new MenuItem(
                "Taco with chicken",
                "Two tacos with soft chicken breasts and cheese sauce",
                false,
                2.49
        ));
        allMenus.add(cafeMenu);

        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
        dessertMenu.add(new MenuItem(
                "Carrot Cake",
                "Sweet cake with carrots and walnuts",
                true,
                1.99
        ));
        dessertMenu.add(new MenuItem(
                "Cookie",
                "Cookie with chocolate chips",
                true,
                0.99
        ));
        cafeMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
