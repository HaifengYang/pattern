package headfirst.designpatterns.iterator.test;

import headfirst.designpatterns.iterator.entity.DinerMenu;
import headfirst.designpatterns.iterator.entity.MenuItem;
import headfirst.designpatterns.iterator.entity.PancakeHouseMenu;
import headfirst.designpatterns.iterator.iterators.interfaces.DinerMenuIterator;
import headfirst.designpatterns.iterator.iterators.interfaces.Iterator;
import headfirst.designpatterns.iterator.iterators.interfaces.PancakeHouseMenuIterator;

public class Waitress {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        DinerMenuIterator dinerMenuIterator = new DinerMenuIterator(dinerMenu);

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        PancakeHouseMenuIterator pancakeHouseMenuIterator = new PancakeHouseMenuIterator(pancakeHouseMenu);

        printIterator(dinerMenuIterator);
        printIterator(pancakeHouseMenuIterator);

    }
    private static void printIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
