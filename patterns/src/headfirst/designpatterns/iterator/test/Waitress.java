package headfirst.designpatterns.iterator.test;

import headfirst.designpatterns.iterator.entity.DinerMenu;
import headfirst.designpatterns.iterator.entity.MenuItem;
import headfirst.designpatterns.iterator.entity.PancakeHouseMenu;
import headfirst.designpatterns.iterator.iterators.interfaces.Iterator;

public class Waitress {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        printIterator(dinerMenu.createIterator());
        printIterator(pancakeHouseMenu.createIterator());

    }
    private static void printIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
