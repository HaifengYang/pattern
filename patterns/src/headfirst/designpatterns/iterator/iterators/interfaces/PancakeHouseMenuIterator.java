package headfirst.designpatterns.iterator.iterators.interfaces;

import headfirst.designpatterns.iterator.entity.MenuItem;
import headfirst.designpatterns.iterator.entity.PancakeHouseMenu;

public class PancakeHouseMenuIterator implements Iterator{
    private PancakeHouseMenu pancakeHouseMenu;

    private int index;

    public PancakeHouseMenuIterator(PancakeHouseMenu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return pancakeHouseMenu.getMenuItems().size() != index;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = (MenuItem) pancakeHouseMenu.getMenuItems().get(index);
        index ++;
        return menuItem;
    }
}
