package Nov.ex_14112024;


    public class Lab163 {

        // Static variable
        static int count = 0;

        // Instance variable
        int instanceCount;

        // Static method
        public static void displayCount() {
            System.out.println("Static Count: " + count);
        }

        // Instance method
        public void displayInstanceCount() {
            System.out.println("Instance Count: " + instanceCount);
        }

        // Static block
        static {
            // This block runs once when the class is first loaded
            System.out.println("Static block executed");
            count = 5; // Initialize static variable count
        }

        // Instance initialization block (IIB)
        {
            // This block runs every time an object is created
            System.out.println("Instance Initialization Block executed");
            instanceCount = 20;  // Initialize instance variable
        }

        // Static nested class
        static class NestedClass {
            public void printMessage() {
                System.out.println("Inside static nested class");
            }
        }

        // Constructor
        public Lab163() {
            System.out.println("Constructor executed");
        }

        public static void main(String[] args) {
            // Static block is executed automatically when the class is loaded
            // Accessing static variable and method directly using the class name
            System.out.println("Accessing static variable count: " + Lab163.count);
            Lab163.displayCount(); // Access static method

            // Creating an instance of the static nested class
            Lab163.NestedClass nested = new Lab163.NestedClass();
            nested.printMessage();  // Calling method in static nested class

            // Creating the first object of Lab163
            System.out.println("Creating first object of Lab163");
            Lab163 obj1 = new Lab163(); // IIB and constructor will be called

            // Creating the second object of Lab163
            System.out.println("Creating second object of Lab163");
            Lab163 obj2 = new Lab163(); // IIB and constructor will be called again

            // Accessing instance method and variables
            obj1.displayInstanceCount();
            obj2.displayInstanceCount();

            // Modifying the static variable and calling the static method again
            Lab163.count = 10;
            Lab163.displayCount();
        }
    }

