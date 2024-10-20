package Oct.ex_18102024;

import java.util.Scanner;

public class Task1802 {

    //Write a program that takes an integer input (1-12)
    // And prints the name of the corresponding month using a switch statement.
    //Input  - 12
    //Out - Dec.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-12) for the month: ");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error: Invalid month number. Please enter a number between 1 and 12.");
                break;
        }

        sc.close();

    }
}
