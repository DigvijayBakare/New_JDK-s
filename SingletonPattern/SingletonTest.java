package SingletonPattern;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();   // This will not work
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // check the equality of the two objects
        System.out.println(obj1 == obj2);
    }
}
