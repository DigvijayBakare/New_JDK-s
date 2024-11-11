package SingletonPattern;

/**
 * Lazy Initialization
 */

public class Singleton {
    private static Singleton instance;

    // Immutable variable
    private final String configValue;

    private Singleton(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigValue() {
        return configValue;
    }

    public static Singleton getInstance() {     // singleton first
        if (instance == null) {
            instance = new Singleton("Default value");
        }
        return instance;
    }

    /*public static synchronized Singleton getInstance() {      // synchronized thread safe
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }*/

    /*public static Singleton getInstance() {         // synchronised block singleton pattern
        synchronized (Singleton.class){
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }*/
}
