package singleton;

public class ThreadSafeDoubleCheckInitialization {

    private static volatile ThreadSafeDoubleCheckInitialization INSTANCE;

    private ThreadSafeDoubleCheckInitialization() {
    }

    public static ThreadSafeDoubleCheckInitialization getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeDoubleCheckInitialization.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeDoubleCheckInitialization();
                }
            }
        }
        return INSTANCE;
    }

}
