package StrategyPattern.DuckTypes;

import StrategyPattern.Duck;
import StrategyPattern.FlyBehaviours.FlyWithWings;
import StrategyPattern.QuackBehaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck.");
    }
}
