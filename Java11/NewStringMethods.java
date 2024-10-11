package Java11;

public class NewStringMethods {
    public static void isBlankMethod() {
        String str = " ";
        System.out.println("Is the given string blank: " +str.isBlank());

        String str1 = "Java 11 Features";
        System.out.println("Is the given string blank: " +str1.isBlank());
    }
    public static void linesMethod() {
        String str = "Java\n11\nFeatures";
        str.lines().forEach(System.out::println);
    }

    public static void strippingMethods() {
        String str = "   Hello World!   ";
        System.out.println("Strip: " + str.strip());                    // trimming both leading and trailing spaces
        System.out.println("Strip Leading: " + str.stripLeading());     // trimming only leading spaces
        System.out.println("Strip Trailing: " + str.stripTrailing());   // trimming only trailing spaces
    }

    public static void repeatMethod() {
        String str = "Java";
        System.out.println("Repeating string: " + str.repeat(3));  // repeat string for no. of counts
    }
    public static void main(String[] args) {
        isBlankMethod();
        linesMethod();
        strippingMethods();
        repeatMethod();
    }
}
