package Nov.ex_12112024;

public class Lab159 {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();  // Calls Dog's sound method
        cat.sound();  // Calls Cat's sound method
    }
}

// Abstract class representing the blueprint for animals
abstract class Animal {
    // Abstract method: must be implemented by subclasses
    abstract void sound();

    // Concrete method: Can be inherited directly by subclasses
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Dog class inherits from Animal and implements the sound method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks!");
    }
}

// Cat class inherits from Animal and implements the sound method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows!");
    }
}
