package statickey;

// Base class
class Base {
    static int i = 10; // Static variable initialized to 10

    // Static block in Base class
    static {
        m1(); // Calling m1 method
        System.out.println("Base Static"); // Printing message
    }

    // Main method in Base class
    public static void main(String[] args) {
        m1(); // Calling m1 method
        System.out.println("base main"); // Printing message
    }

    // m1 method in Base class
    public static void m1() {
        System.out.println(j); // Printing value of j
    }

    static int j = 20; // Static variable initialized to 20
}

// Derived class extending Base class
class Derived extends Base {
    static int x = 100; // Static variable initialized to 100

    // First static block in Derived class
    static {
        m2(); // Calling m2 method
        System.out.println("Derived first static block"); // Printing message
    }

    // Main method in Derived class
    public static void main(String[] args) {
        m2(); // Calling m2 method
        System.out.println("derived main"); // Printing message
    }

    // m2 method in Derived class
    public static void m2() {
        System.out.println(y); // Printing value of y
    }

    // Second static block in Derived class
    static {
        System.out.println("child class second static "); // Printing message
    }

    static int y = 200; // Static variable initialized to 200
}

// Main class
public class StaticControlFlowchild {
    public static void main(String[] args) {
        // Main method of the main class
    }
}
