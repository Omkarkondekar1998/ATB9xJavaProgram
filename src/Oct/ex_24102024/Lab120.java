package Oct.ex_24102024;

public class Lab120 {

    public static void main(String[] args) {

        String name =       "Omkar";
       // name = "Kondekar";
       // name = "OmkarKondekar";
        // name = "Omkar";  // String COnstant pool

        System.out.println(name);

        String name2 = new String("Omkar");
        String name3 = new String("Kondekar");
        String name4 = name3;

    }
}
