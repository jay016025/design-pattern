package iterator;

import iterator.menu.Menu;

import java.util.Iterator;

public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;


    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("MENU:\n----\nBREAKFAST");
        print(pancakeMenuIterator);

        System.out.println("MENU:\n----\nLUNCH");
        print(dinerMenuIterator);

        System.out.println("MENU:\n----\nDINNER");
        print(cafeMenuIterator);
    }

    private void print(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
