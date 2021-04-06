package headfirst.designpatterns.state.entity;

import headfirst.designpatterns.state.drive.GumballMachine;
import headfirst.designpatterns.state.interfaces.State;

import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachine gumballMachine;
    private Random winnerRandom = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert a quarter again.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Your quarter has returned.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You`re turning the crank.");
        if (winnerRandom.nextInt(10) == 0 && gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense.");

    }


    @Override
    public String toString() {
        return "HasQuarterState";
    }
}
