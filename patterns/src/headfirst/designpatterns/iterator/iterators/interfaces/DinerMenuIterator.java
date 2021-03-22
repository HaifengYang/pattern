package headfirst.designpatterns.iterator.iterators.interfaces;

import headfirst.designpatterns.iterator.entity.DinerMenu;
import headfirst.designpatterns.iterator.entity.MenuItem;

public class DinerMenuIterator implements Iterator{

    private DinerMenu dinerMenu;
    private int index;

    public DinerMenuIterator(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return dinerMenu.getMenuItems().length != index;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = dinerMenu.getMenuItems()[index];
        index++;
        return menuItem;
    }
}
