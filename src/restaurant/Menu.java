package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private String menuUpdate;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItemToMenu(MenuItem newItem, String todayDate) {
        boolean repeat = false;
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).equals(newItem)) {
                repeat = true;
            }
        }
        if (repeat) {
            System.out.println(newItem.getName() + "is already on the menu!");
        }
        else {
            menu.add(newItem);
            setMenuUpdate(todayDate);
        }
    }

    public void removeItemFromMenu(MenuItem item, String todayDate) {
        menu.remove(item);
        setMenuUpdate(todayDate);
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenuUpdate(String updated) {
        menuUpdate = updated;
    }

    public String getMenuUpdate() {
        return menuUpdate;
    }



}
