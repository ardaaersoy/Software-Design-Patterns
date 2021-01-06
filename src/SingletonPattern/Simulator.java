package SingletonPattern;

public class Simulator {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printObj();
    }
}
