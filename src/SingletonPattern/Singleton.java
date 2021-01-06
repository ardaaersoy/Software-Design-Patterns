package SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void printObj() {
        System.out.println("This is a static method called via uniqueInstance.");
    }
}
