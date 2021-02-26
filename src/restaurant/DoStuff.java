package restaurant;

import java.util.HashMap;

public class DoStuff {

    public static void main(String[] args) {
        MenuItem burger = new MenuItem("burger", 10.0, "A patty between two buns", "entree");
        MenuItem soup = new MenuItem("soup", 5.0, "some broth with meat", "appetizer");
        MenuItem cake = new MenuItem("cake", 8.0, "vanilla cake", "dessert");

        HashMap<MenuItem, Boolean> myMenu = new HashMap<>();

        Menu myRestaurantMenu = new Menu(myMenu);
        myRestaurantMenu.addItemToMenu(burger, false, "Sept 2020");
        myRestaurantMenu.addItemToMenu(soup, false, "Sept 2020");
        myRestaurantMenu.addItemToMenu(cake, true, "Feb 25, 2021");

        myRestaurantMenu.getMenu();

        //Display the menu. Will run a for loop and at the ned run the menu update line once.
        //System.out.println("f");
        System.out.println("This menu was last updated on " + myRestaurantMenu.getMenuUpdate());

    }
}
