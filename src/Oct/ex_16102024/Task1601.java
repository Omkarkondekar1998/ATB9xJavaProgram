package Oct.ex_16102024;

import java.util.Scanner;

public class Task1601 {

    public static <scanner> void main(String[] args) {
        //   Take a user input - Name, Age and Salary and print them in the end.

        //Create scanner object
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // Read string input for name.
        System.out.println("Enter your name");

        int age = scanner.nextInt();    // Read integer input for age.
        System.out.println("Enter your age");

        double salary = scanner.nextDouble();  // Read double input for salary.
        System.out.println("Enter your salary");

        System.out.println(" \n User Information:");
        System.out.println("Name- " + name);
        System.out.println("Age- " + age);
        System.out.println("Salary- " + salary);

        scanner.close();
    }

}
