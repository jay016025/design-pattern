package iterator;

import iterator.menu.CafeMenu;
import iterator.menu.DinerMenu;
import iterator.menu.PancakeHouseMenu;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void testIteratorPattern() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
