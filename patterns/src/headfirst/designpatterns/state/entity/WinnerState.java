package headfirst.designpatterns.state.entity;

import headfirst.designpatterns.state.drive.GumballMachine;
import headfirst.designpatterns.state.interfaces.State;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("================You`re a winner===================");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0)
            gumballMachine.setState(gumballMachine.getSoldOutState());
        else {
           gumballMachine.releaseBall();
           if (gumballMachine.getCount() == 0){
               gumballMachine.setState(gumballMachine.getSoldOutState());
           }else {
               gumballMachine.setState(gumballMachine.getNoQuarterState());
           }
        }
    }

    @Override
    public String toString() {
        return "WinnerState";
    }
}
