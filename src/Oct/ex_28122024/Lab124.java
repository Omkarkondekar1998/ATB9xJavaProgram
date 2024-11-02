package Oct.ex_28122024;

public class Lab124 {
    public static void main(String[] args) {
        // String buffer Vs String Builder

        StringBuffer stringbuffer = new StringBuffer("Omkar");
        stringbuffer.append("Kondekar");
        System.out.println(stringbuffer);
        stringbuffer.reverse();
        System.out.println(stringbuffer);


        StringBuilder stringbuilder = new StringBuilder("Omkar");
        stringbuilder.append("Kondekar");
        System.out.println(stringbuilder);
    }

}
