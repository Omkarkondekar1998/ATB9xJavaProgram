package Oct.ex_15102024;

public class Lab065 {

    public static void main(String[] args) {
        int a3 = 5;
        int b3 = a3--; // b gets the value of a (5), then a is decremented to 4.

        System.out.println(a3);
        System.out.println(b3);

        int a4 = 5;
        int b4 = --a4; // a is decremented to 4 first, then b gets this new value (4).

        System.out.println(a4);
        System.out.println(b4);
    }
}
