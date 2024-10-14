package Oct.ex_11102024;

public class Lab044 {
    public static void main(String[] args) {
        //!, &&, ||
        /* AND (&&): Both conditions must be true to return true.
            OR (||): At least one condition must be true to return true.*/

        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT
        System.out.println("!a: " + !a); // false
        System.out.println("!b: " + !b); // true
    }
}
