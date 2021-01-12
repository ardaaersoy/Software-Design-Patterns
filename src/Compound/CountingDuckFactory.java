package Compound;

import Compound.Ducks.DuckCall;
import Compound.Ducks.MallardDuck;
import Compound.Ducks.RedheadDuck;
import Compound.Ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    // --> Each method wraps the Quackable with the quack counting decorator. The simulator will never know the
    // difference; it just gets back a Quackable. But now our rangers can be sure that all quacks are being counted.

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
