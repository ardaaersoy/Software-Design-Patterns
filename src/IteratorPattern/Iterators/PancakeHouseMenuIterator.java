package IteratorPattern.Iterators;

import IteratorPattern.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    // --> position maintains the current position of the iteration over the array.
    int position = 0;

    // --> The constructor takes the array of menu items we are going to iterate over.
    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
