package Java11;

public class NestBased {
    private String outerField = "Outer Field";

    class InnerClass {
        private String innerField = "Inner Field";

        void accessOuter() {
            // Accessing private member of OuterClass
            System.out.println(outerField);
        }
    }

    void accessInner() {
        InnerClass inner = new InnerClass();
        // Accessing private member of InnerClass
        System.out.println(inner.innerField);
    }

    public static void main(String[] args) {
        NestBased outer = new NestBased();
        NestBased.InnerClass inner = outer.new InnerClass();

        outer.accessInner();  // Prints "Inner Field"
        inner.accessOuter();  // Prints "Outer Field"
    }
}
