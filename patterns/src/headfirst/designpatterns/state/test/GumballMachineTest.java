package headfirst.designpatterns.state.test;

import headfirst.designpatterns.state.drive.GumballMachine;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);

        for (int i = 0; i < 10; i++) {
            gumballMachine.inertQuarter();
            gumballMachine.turnCrank();
        }
    }
}
