package Oct.ex_29102024;

public class Lab125 {

    public static void main(String[] args) {

        // Before creation arrays we have fix size
        int[] marks_2 = new int[5];  //fixed size
        System.out.println(marks_2.length);

        marks_2[2] = 13;
        marks_2[3] = 23;
        marks_2[4] = 33;
        marks_2[0] = 43;

        System.out.println(marks_2[2]);
        System.out.println(marks_2[3]);
        System.out.println(marks_2[0]);
        System.out.println(marks_2[4]);

    }
}
