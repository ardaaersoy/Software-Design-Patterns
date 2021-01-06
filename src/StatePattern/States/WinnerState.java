package StatePattern.States;

import StatePattern.State;
import StatePattern.GumballMachine;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we are already giving you a gumball.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again does not get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU’RE A WINNER !You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs !");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
