package StrategyPattern.DuckTypes;

import StrategyPattern.Duck;
import StrategyPattern.FlyBehaviours.FlyNoWay;
import StrategyPattern.QuackBehaviours.MuteQuack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck.");
    }
}
