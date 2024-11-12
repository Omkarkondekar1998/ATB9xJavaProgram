package Nov.ex_07112024.Example1.Polymorphism08112024.Overriding;

public class Lab151 {

    public static void main(String[] args) {
        // Creating a reference of type Human but pointing to an Adult object
        Human human1 = new Adult();

        // Calling the overridden introduce method, based on the actual object (Adult)
        human1.introduce(); // Output: Hello, I am an Adult.

        // Creating a reference of type Human but pointing to a Child object
        Human human2 = new Child();

        // Calling the overridden introduce method, based on the actual object (Child)
        human2.introduce(); // Output: Hi, I am a Child.
    }
}

// Parent class Human
class Human {
    // Method to introduce, which will be overridden by child classes
    void introduce() {
        System.out.println("I am a human.");
    }
}

// Child class Adult that extends Human
class Adult extends Human {

    // Overriding the introduce method
    @Override
    void introduce() {
        System.out.println("Hello, I am an Adult.");
    }
}

// Child class Child that extends Human
class Child extends Human {

    // Overriding the introduce method
    @Override
    void introduce() {
        System.out.println("Hi, I am a Child.");
    }
}

