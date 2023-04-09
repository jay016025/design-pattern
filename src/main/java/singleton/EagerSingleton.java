package singleton;

/**
 * 在多執行續環境下，且不消耗效能方式建立單例
 *
 * 但會消耗空間
 */
public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {return singleton;}
}
