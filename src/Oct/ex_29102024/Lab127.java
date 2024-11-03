package Oct.ex_29102024;

import java.util.Arrays;

public class Lab127 {
    public static void main(String[] args) {
        int[] marks ={51, 65,45,89,81};

        System.out.println(marks.length); //5

        Arrays.sort(marks); //
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

            System.out.println("-------------------------------------------------------------");

            Arrays.sort(marks); // Sorting in Acending order here
            int item_indexing = Arrays.binarySearch(marks, 81);
            System.out.println(item_indexing);
        }
    }
}

