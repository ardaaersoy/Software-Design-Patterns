package Compound;

// --> We need to implement the Observable interface or else we won’t be able to register with a QuackObservable.
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
