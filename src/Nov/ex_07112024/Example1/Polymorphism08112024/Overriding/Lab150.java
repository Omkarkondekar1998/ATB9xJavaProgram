package Nov.ex_07112024.Example1.Polymorphism08112024.Overriding;

public class Lab150 {

    public static void main(String[] args) {
        // Creating an instance of Hound
        Hound H1 = new Hound();

        // Calling the overridden bark method
        H1.bark();
    }
}

// Parent class Dog
class Dog {
    // Method to bark, which will be overridden
    void bark() {
        System.out.println("I am Dog. I can Bark!");
    }

    int age = 10;
}

// Child class Hound that extends Dog
class Hound extends Dog {

    // Overriding the bark method
    @Override
    void bark() {
        System.out.println("I am Hound. I can also bark!");
    }
}