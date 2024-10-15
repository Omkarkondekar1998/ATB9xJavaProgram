package Oct.ex_15102024;

public class Lab064 {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = ++a1; // Here, a is incremented to 6 first, and then b receives this new value (6).
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 5;
        int b2 = a2++; // Here, b receives the value of a (5), then a becomes 6.
        System.out.println(a2);
        System.out.println(b2);



    }
}
