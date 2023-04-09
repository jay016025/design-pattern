package singleton;

/**
 * 雙重檢查鎖實現單例
 *
 * 既不消耗效能也不消耗空間
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton() {}

    public static DoubleCheckLockSingleton getInstance() {

        if (singleton == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if(singleton == null) singleton = new DoubleCheckLockSingleton();
            }
        }

        return singleton;
    }
}
