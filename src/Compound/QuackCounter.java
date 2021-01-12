package Compound;

public class QuackCounter implements Quackable {
    // --> We’ve got an instance variable to hold on to the quacker we’re decorating.
    Quackable duck;
    static int numberOfQuacks;

    // --> We get the reference to the Quackable we’re decorating in the constructor.
    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
    }

    @Override
    public void quack() {
        // --> When quack() is called, we delegate the call to the Quackable we’re decorating...
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
