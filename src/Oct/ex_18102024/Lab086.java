package Oct.ex_18102024;

import java.util.Scanner;

public class Lab086 {

    public static void main(String[] args) {

        // Declare an item code (leading zeros are removed)
        int item = 3; // Set to 3 for demonstration; you can change this to any valid code

        // Switch statement to categorize item codes
        switch (item) {
            // Group case statements for electronic items
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("These are electronic items.");
                break;

            // Group case statements for mechanical items
            case 5:
            case 6:
            case 7: // Removed the duplicate case
                System.out.println("These are mechanical items.");
                break;

            // Default case for unrecognized item codes
            default:
                System.out.println("Unknown item code.");
                break;
        }

    }

}
