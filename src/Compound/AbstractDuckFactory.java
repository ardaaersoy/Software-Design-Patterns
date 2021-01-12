package Compound;

// --> We’re defining an abstract factory that subclasses will implement to create different families.
public abstract class AbstractDuckFactory {
    // --> Each method creates one kind of duck.
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
