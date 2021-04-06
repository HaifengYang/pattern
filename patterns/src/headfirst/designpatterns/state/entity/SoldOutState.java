package headfirst.designpatterns.state.entity;

import headfirst.designpatterns.state.drive.GumballMachine;
import headfirst.designpatterns.state.interfaces.State;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert, gumballs had sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven`t insert a quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("There`s no gumballs left.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense.");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
