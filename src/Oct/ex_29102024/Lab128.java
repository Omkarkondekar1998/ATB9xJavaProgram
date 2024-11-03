package Oct.ex_29102024;

import java.util.Arrays;

public class Lab128 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 78, 23, 56, 34, 91};

        int max = numbers[0]; // Initialize max
        int min = numbers[0]; // Initialize min

        // Iterate through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }

}




