package Compound.Ducks;

import Compound.Observable;
import Compound.Observer;
import Compound.Quackable;

public class MallardDuck implements Quackable {
    // --> Each Quackable has an Observable instance variable.
    Observable observable;

    // --> In the constructor, we create an Observable and pass it a reference to the MallardDuck object.
    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
