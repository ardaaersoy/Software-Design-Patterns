package IteratorPattern;

import IteratorPattern.Menus.DinerMenu;
import IteratorPattern.Menus.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}
