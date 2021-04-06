package headfirst.designpatterns.state.entity;

import headfirst.designpatterns.state.drive.GumballMachine;
import headfirst.designpatterns.state.interfaces.State;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we`re already giving you a gumball.");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("The gumball is rolling out, you cannot eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Wait, the gumball is rolling.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else
            gumballMachine.setState(gumballMachine.getSoldOutState());
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
