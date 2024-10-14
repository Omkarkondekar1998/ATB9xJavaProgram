package Oct.ex_11102024;

public class Lab042 {

    public static void main(String[] args) {
        String name1 = "Omkar";
        String name2 = "Kondekar";

        int a =10;
        int b =10;

        //always check LH to RH./////

        System.out.println(name1 + name2 + a + b); //first operator performed COncatenation
        System.out.println(a + b + name1 + name2); //first operator performed operation, not concatenation.
        System.out.println(name1 + name2 + (a + b));
        //(BODMAS)

    }
}
