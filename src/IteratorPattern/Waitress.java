package IteratorPattern;

import IteratorPattern.Menus.DinerMenu;
import IteratorPattern.Menus.PancakeHouseMenu;

public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dm, PancakeHouseMenu phm) {
        this.dinerMenu = dm;
        this.pancakeHouseMenu = phm;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();

        System.out.println("\n-->MENU\nBreakfast\n");
        printMenu(dinerIterator);

        System.out.println("\n-->MENU\nLunch\n");
        printMenu(pancakeHouseIterator);
    }

    // --> The overloaded printMenu() method uses the Iterator to step through the menu items and print them.
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + ", " + menuItem.getDescription());
        }
    }
}
