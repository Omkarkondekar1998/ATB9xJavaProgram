package Oct.ex_30122024;

public class Lab131 {
    public static void main(String[] args) {

        int[] a = new int[3]; // The array `a` will have space for 3 integer elements.

        a[0] = 99;  // The first element of the array (at index 0) is assigned the value 99.
        a[1] = 93;
        a[2] = 81;

        for (int i : a) {
            System.out.println(i);
            // The enhanced for loop (also known as a for-each loop) iterates over each element in the array `a`.
            // `i` represents the current value of each element during each iteration.
        }

        String[] friends = {"Omkar","Rushi","Aashay"};
        for (String name:friends)
        {
            System.out.println(name);
    }
}
}