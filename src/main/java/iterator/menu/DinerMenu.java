package iterator.menu;

import iterator.MenuItem;
import iterator.concreateIterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;

    private int numberOfItems;

    MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full!! Can't add more items.");
        }

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }


}
