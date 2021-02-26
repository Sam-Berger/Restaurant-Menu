package restaurant;

import java.util.ArrayList;

public class Restaurant {



    public static void printMenu(Menu menu) {
        System.out.println("Sam's Ristorante Menu");
        System.out.print("*********\n");

        for (int i = 0; i < menu.getMenu().size(); i++) {
            if (menu.getMenu().get(i).isNewOrOld()) {
                System.out.println("Check our this NEW ITEM!");
            }
            System.out.println(menu.getMenu().get(i).getName());
            System.out.println(menu.getMenu().get(i).getDescription());
            System.out.println("$" + menu.getMenu().get(i).getPrice());
            System.out.print("*********\n");
        }
        System.out.println("This menu was last updated on " + menu.getMenuUpdate());
    }

    public static void printMenuItem(Menu menu, int i) {
        System.out.println(menu.getMenu().get(i).getName());
        System.out.println(menu.getMenu().get(i).getDescription());
        System.out.println("$" + menu.getMenu().get(i).getPrice());
    }

    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 10.00, "A patty between two buns", "entree", false);
        MenuItem soup = new MenuItem("French Onion Soup", 5.00, "Amazing slow cooked onions in broth", "appetizer", false);
        MenuItem cake = new MenuItem("Vanilla Cake", 8.00, "Velvety yumminess", "dessert", true);
        MenuItem grilledCheese = new MenuItem("Grilled Cheese", 11.00, "Melty cheese between two pieces of bread.", "entree", true);
        MenuItem fries = new MenuItem("Fries", 8.00, "You know what this is. Yout want it", "appetizer", false);
        MenuItem iceCream = new MenuItem("Ice Cream", 4.00, "A small scoop of Ice Cream of your choice: vanilla, chocolate, or strawberry", "dessert", true);

        ArrayList<MenuItem> myMenu = new ArrayList<>();

        Menu myRestaurantMenu = new Menu(myMenu);
        myRestaurantMenu.addItemToMenu(burger, "Sept 2020");
        myRestaurantMenu.addItemToMenu(burger, "Sept 2020");
        myRestaurantMenu.addItemToMenu(burger, "Sept 2020");
        myRestaurantMenu.addItemToMenu(soup, "Sept 2020");
        myRestaurantMenu.addItemToMenu(cake, "Feb 25, 2021");
        myRestaurantMenu.addItemToMenu(grilledCheese, "Feb 25, 2021");
        myRestaurantMenu.addItemToMenu(fries, "Sept 2020");
        myRestaurantMenu.addItemToMenu(iceCream, "Feb 25, 2021");

        printMenuItem(myRestaurantMenu, 0);

        printMenu(myRestaurantMenu);

        myRestaurantMenu.removeItemFromMenu(burger, "Feb 26, 2021");

        printMenu(myRestaurantMenu);

    }

}
