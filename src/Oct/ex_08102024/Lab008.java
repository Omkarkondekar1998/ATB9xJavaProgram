package Oct.ex_08102024;

// Rules for Java Identifiers
// 1. Valid Characters: Identifiers can contain letters, digits, underscores, and dollar signs.
// 2. Starting Character: An identifier must start with a letter, an underscore, or a dollar sign.
// 3. Length: There is no strict limit on the length, but it should be meaningful.
// 4. Case Sensitivity: Identifiers are case-sensitive (e.g., myVariable vs MyVariable).
// 5. Keywords: Identifiers cannot be Java reserved keywords (e.g., int, class, public).
// 6. Unicode: Identifiers can include Unicode characters, but it's best to stick to standard characters for readability.
public class Lab008 {

    public static void main(String[] args) {
        int myVariable = 10;  // Valid: starts with a letter
        int _count = 5;       // Valid: starts with an underscore
        int $amount = 20;     // Valid: starts with a dollar sign
        int user123 = 15;     // Valid: starts with a letter and contains digits

        // Invalid identifiers
        // int 123abc = 0;     // Invalid: starts with a digit
        // int my-variable = 0; // Invalid: contains a hyphen
        // int class = 0;      // Invalid: keyword
        // int my variable = 0; // Invalid: contains a space

        System.out.println("Valid identifiers are used in the program.");

    }

}
