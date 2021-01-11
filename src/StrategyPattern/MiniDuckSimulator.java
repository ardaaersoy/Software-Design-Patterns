package StrategyPattern;

import StrategyPattern.DuckTypes.MallardDuck;
import StrategyPattern.DuckTypes.RedheadDuck;
import StrategyPattern.FlyBehaviours.FlyWithWings;
import StrategyPattern.QuackBehaviours.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck redhead = new RedheadDuck();
        redhead.performFly();
        redhead.performQuack();

        redhead.setFlyBehaviour(new FlyWithWings());
        redhead.setQuackBehaviour(new Squeak());

        redhead.performFly();
        redhead.performQuack();
    }
}