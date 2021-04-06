package headfirst.designpatterns.state.entity;

import headfirst.designpatterns.state.drive.GumballMachine;
import headfirst.designpatterns.state.interfaces.State;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You`re insert a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven`t insert a quarter.");

    }

    @Override
    public void turnCrank() {
        System.out.println("You cannot turn the crank since you haven`t insert a quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense.");
    }


    @Override
    public String toString() {
        return "NoQuarterState";
    }

}
