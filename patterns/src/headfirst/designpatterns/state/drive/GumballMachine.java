package headfirst.designpatterns.state.drive;

import headfirst.designpatterns.state.entity.*;
import headfirst.designpatterns.state.interfaces.State;

public class GumballMachine {
    private State soldOutState;
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    private State winnerState;

    private State state;
    private int count = 0;


    public GumballMachine(int numberOfGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        this.state = noQuarterState;
    }

    public void inertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }


    public void releaseBall(){
        System.out.println("A gumball is rolling out from the slot.");
        if (count != 0) count--;
    }

    public State getSoldOutState() {
        return soldOutState;
    }


    public State getSoldState() {
        return soldState;
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }


    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
