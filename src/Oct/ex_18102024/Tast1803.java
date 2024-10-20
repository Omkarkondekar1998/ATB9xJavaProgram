package Oct.ex_18102024;

import java.util.Scanner;

public class Tast1803 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Conversion options
        System.out.println("Unit Conversion Options:");
        System.out.println("1: Kilometers to Miles");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Kilometers to Miles conversion
                System.out.print("Enter distance in kilometers: ");
                double kilometers = sc.nextDouble();
                double miles = kilometers * 0.621371; // Conversion factor
                System.out.printf("%.2f kilometers is %.2f miles.%n", kilometers, miles);
                break;

            case 2:
                // Fahrenheit to Celsius conversion
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsius);
                break;

            default:
                System.out.println("Error: Invalid choice. Please enter 1 or 2.");
                break;
        }

        // Close the scanner
        sc.close();
    }
}
