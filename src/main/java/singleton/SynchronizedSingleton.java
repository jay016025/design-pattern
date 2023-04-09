package singleton;

/**
 * 加入鎖的單例模式，防止多執行續環境下類別被創立多個
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {

        if(singleton == null) singleton = new SynchronizedSingleton();

        return singleton;
    }
}
