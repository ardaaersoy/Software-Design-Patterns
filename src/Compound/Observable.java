package Compound;

import java.util.ArrayList;
import java.util.Iterator;

// --> Observable must implement QuackObservable because these are the same method calls that are going to be delegated to it.
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    // --> In the constructor we get passed the QuackObservable that is using this object to manage its observable behavior.
    // Check out the notify() method below; you’ll see that when a notify occurs, Observable passes this object along so that the observer knows which object is quacking.
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
