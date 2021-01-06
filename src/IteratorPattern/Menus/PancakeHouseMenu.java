package IteratorPattern.Menus;

import IteratorPattern.Iterator;

import java.util.ArrayList;

import IteratorPattern.Iterators.PancakeHouseMenuIterator;
import IteratorPattern.MenuItem;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    // --> the createIterator() method. It creates a DinerMenuIterator from the
    // menuItems array and returns it to the client.
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
