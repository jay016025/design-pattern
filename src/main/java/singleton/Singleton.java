package singleton;

/**
 * 基本得單例模式實作
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {

        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
