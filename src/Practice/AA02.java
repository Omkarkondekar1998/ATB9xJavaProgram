package Practice;

public class AA02 {

    public static void main(String[] args) {
        // Input string
        String input = "IT WORLD";

        // Variable to store the reversed string
        String reversed = "";

        // Loop through the input string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--)
        {

            // Append each character to the reversed string
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);

    }
}
