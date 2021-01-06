package IteratorPattern.Iterators;

import IteratorPattern.Iterator;
import IteratorPattern.MenuItem;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    // --> position maintains the current position of the iteration over the array.
    int position = 0;

    // --> The constructor takes the array of menu items we are going to iterate over.
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
