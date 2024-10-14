package Java17;

// sealed class example

sealed class Person permits Employee, Manager {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}

final class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
}

final class Manager extends Person {
    public Manager(String name) {
        super(name);
    }
}

public class SealedClass {
    public static void main(String[] args) {
        Person employee = new Employee("Alice");
        Person manager = new Manager("Bob");

        System.out.println("Employee Name: " + employee.name()); // Employee Name: Alice
        System.out.println("Manager Name: " + manager.name());   // Manager Name: Bob
    }
}

/*
    Explanation:
        Sealed Class: The Person class is sealed, meaning it restricts which classes can extend it.
        Permits Clause: The permits clause specifies that only Employee and Manager can extend Person.
        Final Subclasses: Employee and Manager are marked as final, ensuring they cannot be further subclassed.
 */