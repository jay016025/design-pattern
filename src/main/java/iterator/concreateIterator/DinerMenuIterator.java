package iterator.concreateIterator;

import iterator.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {this.menuItems = menuItems;}

    @Override
    public boolean hasNext() {

        if (position >= menuItems.length || menuItems[position] == null) return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position++];
        return menuItem;
    }
}
