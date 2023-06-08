package composite;

import java.util.ArrayList;
import java.util.List;

public class MenuComposite extends MenuComponent{

    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public MenuComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------------------");

        for(MenuComponent item : menuComponents) {
            item.print();
        }
    }
}
