package iterator.menu;

import iterator.MenuItem;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
