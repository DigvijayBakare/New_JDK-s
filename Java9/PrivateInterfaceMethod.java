package Java9;

public class PrivateInterfaceMethod implements CustomInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract methods implementation");
    }
    public static void main(String[] args) {
        CustomInterface customInterface = new PrivateInterfaceMethod();
        customInterface.abstractMethod();
        customInterface.defaultMethod();
        CustomInterface.staticMethod();
    }
}

interface CustomInterface {
    public abstract void abstractMethod();

    public default void defaultMethod() {
        privateMethod();
        privateStaticMethod();      // we can call both the non-static and static methods in the default method
        System.out.println("Default method");
    }

    public static void staticMethod() {
        privateStaticMethod();          // we can call only private static method in static method
        System.out.println("Static method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    private static void privateStaticMethod() {
        System.out.println("Private static method");
    }
}
