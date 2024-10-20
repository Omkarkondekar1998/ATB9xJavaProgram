package Practice;

public class AA001_reverse_string_without_stringinbuilt_function {
    public static void main(String[] args) {
       // Write a Java Program to reverse a string without using String inbuilt function.

        // Declare a String variable and initialize it with the value "Automation"
        String string1 = "Automation";

        // Create a StringBuilder object to manipulate strings more efficiently
        StringBuilder string2 = new StringBuilder();

        // Append the contents of string1 to string2
        string2.append(string1);

        // Reverse the contents of string2
        string2 = string2.reverse();  // The reverse() method modifies the string in place

        // Print the reversed string to the console
        System.out.println(string2);  // Output will be "noitamotuA"
    }
}
