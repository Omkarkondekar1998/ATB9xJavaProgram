package Nov.ex_12112024;

public class Lab160 {


    interface Animal {
        // Abstract method (implicitly public and abstract)
        void sound();

        // Constant variable (implicitly public, static, and final)
        int legs = 4;

        // Static method in interface (Java 8 and onwards)
        static void description() {
            System.out.println("Animals make different sounds.");
        }
    }

    class Dog implements Animal {
        // Implementing the abstract method from the Animal interface
        public void sound() {
            System.out.println("Dog barks!");
        }
    }

    class Cat implements Animal {
        // Implementing the abstract method from the Animal interface
        public void sound() {
            System.out.println("Cat meows!");
        }
    }

    public class InterfaceExample {
        public void main(String[] args) {
            // Creating objects of Dog and Cat classes
            Animal dog = new Dog();
            Animal cat = new Cat();

            // Calling the implemented methods
            dog.sound(); // Output: Dog barks!
            cat.sound(); // Output: Cat meows!

            // Accessing the constant variable 'legs' from the interface
            System.out.println("A dog has " + dog.legs + " legs.");

            // Calling the static method from the interface
            Animal.description(); // Output: Animals make different sounds.
        }
    }

}
