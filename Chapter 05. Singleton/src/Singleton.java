
/*
    Classic example of Singleton patter. It's not thread safe though. Solutions:
        1. Use synchornize keyword for getInstace() method;
        2. Use field initialization for uniqueInstance = new Singleton();
        3. Use double-locking:
            if (uniqueInstance == null) {
                synchronized (Singleton.class) {
                    if (uniqueInstance == null) {
                        uniqueInstance = new Singleton();
                    }
                }
            }
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
