package Compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    // --> We’re using an ArrayList inside each Flock to hold the Quackables that belong to the Flock.
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    // --> After all, the Flock is a Quackable too. The quack() method in Flock needs to work over
    // the entire Flock. Here we iterate through the ArrayList and call quack() on each element.
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
