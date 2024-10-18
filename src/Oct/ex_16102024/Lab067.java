package Oct.ex_16102024;

public class Lab067 {

    public static void main(String[] args) {

      //  Rough logic for maximum of three numbers.

        //(a>=b && a>=c)?a: (b>=c)b?c;

        int a=23;
        int b=67;
        int c = 43;

        int result = (a>=b && a>=c)?a: (b>=c)?b:c;

        System.out.println("this is a maximum no-> " + result);

    }
}
