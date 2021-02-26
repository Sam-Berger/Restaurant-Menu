package restaurant;

import java.util.Date;
import java.util.HashMap;

public class Menu {

    private String menuUpdate;
    private HashMap<MenuItem, Boolean> menu = new HashMap<MenuItem, Boolean>();

    public Menu(HashMap<MenuItem, Boolean> menu) {
        menu = this.menu;
    }

    public void addItemToMenu(MenuItem newItem, Boolean oldOrNew, String todayDate) {
        menu.put(newItem, oldOrNew);
        setMenuUpdate(todayDate);
    }

    public HashMap<MenuItem, Boolean> getMenu() {
        return menu;
    }

    public void setMenuUpdate(String updated) {
        menuUpdate = updated;
    }

    public String getMenuUpdate() {
        return menuUpdate;
    }



}
