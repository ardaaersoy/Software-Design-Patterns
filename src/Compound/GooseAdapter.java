package Compound;

// --> Remember, an Adapter implements the target interface, which in this case is Quackable.
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    // --> The constructor takes the goose we are going to adapt.
    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    // --> When quack is called, the call is delegated to the goose’s honk() method.
    @Override
    public void quack() {
        goose.honk();
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
