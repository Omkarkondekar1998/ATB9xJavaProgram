package Oct.ex_24102024;

public class Lab121 {

        public static void main(String[] args) {
            String real = "Omkar Kondekar";
            System.out.println("real String: " + real); // Outputs: Omkar Kondekar

            // Convert to uppercase
            String upperCaseString = real.toUpperCase();
            System.out.println("Uppercase String -> " + upperCaseString); // Outputs: OMKAR KONDEKAR

            // Show that the original string is unchanged
            System.out.println("After toUpperCase, real String -> " + real); // Outputs: Omkar Kondekar
        }
    }