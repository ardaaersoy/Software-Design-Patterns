package Compound;

import Compound.Ducks.DuckCall;
import Compound.Ducks.MallardDuck;
import Compound.Ducks.RedheadDuck;
import Compound.Ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    // --> Each method creates a product: a particular kind of Quackable. The actual product
    // is unknown to the simulator - it just knows it’s getting a Quackable.

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
