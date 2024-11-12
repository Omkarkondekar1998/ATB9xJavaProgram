package Nov.ex_07112024.Example1.Polymorphism08112024.Overloading;

public class Lab149 {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        // Calling the add method with two integer arguments
        int result1 = mathOperations.add(3, 4);
        System.out.println("Result of add(int, int): " + result1);

        // Calling the overloaded add method with three integer arguments
        int result2 = mathOperations.add(3, 4, 5);
        System.out.println("Result of add(int, int, int): " + result2);

        // Calling the overloaded add method with two double arguments
        double result3 = mathOperations.add(3.5, 4.5);
        System.out.println("Result of add(double, double): " + result3);
    }
}

class MathOperations {

    void add(){
        System.out.println("Wife Zero Argument!");
    }
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}