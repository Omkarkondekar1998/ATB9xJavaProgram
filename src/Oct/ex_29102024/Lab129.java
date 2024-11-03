package Oct.ex_29102024;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Lab129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Corrected the for loop
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number:");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("---------------------");

        System.out.println("the numbers are....");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }
    }
}
