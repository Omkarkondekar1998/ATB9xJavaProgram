package Oct.ex_30122024;

public class Lab135 {
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matrix.length; i++) {       // Outer loop: Iterates over rows
            for (int j = 0; j < matrix[i].length; j++) {  // Inner loop: Iterates over elements in each row
                System.out.print(matrix[i][j]);       // Print the element at [i][j]
            }
        }
    }



}
