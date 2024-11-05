package Oct.ex_30122024;

public class Lab134 {
    public static void main(String[] args) {

                // Jagged array (rows of different lengths)
                // The first row has 3 elements, and the second row has 6 elements.
                int[][] matrix = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}};

                // Valid 2D array with 3 rows and 2 columns
                // Each row has 2 elements, so it is a 2D rectangular array with dimensions 3x2.
                int[][] martix_3_2 = {{1, 2}, {3, 4}, {5, 6}};

                // Jagged array with 3 rows and 1 column
                // Each row has 1 element, so this is another jagged array.
                int[][] martix_3_1 = {{1}, {3}, {5}};

                // Valid 2D array with 2 rows and 2 columns
                // This is a 2D rectangular array where each row has 2 elements.
                int[][] martix_2_2 = {{1, 2}, {3, 4}};

                // Example of printing the arrays (for demonstration purposes)

                // Print the first jagged array 'matrix' which has rows of different lengths
                System.out.println("matrix: ");
                // Outer loop iterates through each row of the matrix
                for (int[] row : matrix) {
                    // Inner loop iterates through each element of the current row
                    for (int element : row) {
                        System.out.print(element + " ");  // Print each element followed by a space
                    }
                    System.out.println();  // Move to the next line after printing the current row
                }

                // Print the second 2D array 'martix_3_2'
                System.out.println("martix_3_2: ");
                for (int[] row : martix_3_2) {
                    for (int element : row) {
                        System.out.print(element + " ");  // Print each element of the current row
                    }
                    System.out.println();  // Move to the next line after printing the current row
                }

                // Print the third jagged array 'martix_3_1'
                System.out.println("martix_3_1: ");
                for (int[] row : martix_3_1) {
                    for (int element : row) {
                        System.out.print(element + " ");  // Print each element of the current row
                    }
                    System.out.println();  // Move to the next line after printing the current row
                }

                // Print the fourth 2D array 'martix_2_2'
                System.out.println("martix_2_2: ");
                for (int[] row : martix_2_2) {
                    for (int element : row) {
                        System.out.print(element + " ");  // Print each element of the current row
                    }
                    System.out.println();  // Move to the next line after printing the current row
                }

    }
}
