package ObserverPattern;

public interface Subject {
    public void registerObserver(Observer o);

    public void remoteObserver(Observer o);

    public void notifyObservers();
}
