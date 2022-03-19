package design_pattern.creational;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
