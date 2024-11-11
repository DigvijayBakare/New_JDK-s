package SingletonPattern;

import java.io.Serializable;

/**
 * Eager Initialization
 */

public class Singleton2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
