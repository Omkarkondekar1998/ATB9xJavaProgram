package Oct.ex_28122024;

public class Task2801 {

    public static void main(String[] args) {
        // Commonly used function - substring (Used to extract a portion of the String)
        String string = "ChocolateChip"; // Extract a substring from the string
        String Substring = string.substring(0, 8); // This will get characters from index 0 to index 8 (not including 8)
        System.out.println(Substring); // Print the extracted substring

// Commonly used function - Concatenation (Used to combine two strings)
        String FirstName = "Aditi";
        String Full_Name = FirstName.concat(" Sharma"); // Concatenation of Strings
        System.out.println(Full_Name);

// Using + for multiple string concatenation
        String a1 = "Dr.";
        String a2 = "Aditi";
        String a3 = "Sharma";

        System.out.println(a1 + " " + a2 + " " + a3 + " ");

// Splitting the string
// A sentence with fruit names separated by commas
        String fruits = "Apple, Banana, Cherry, Date, Elderberry";

// Split the sentence using a comma as a delimiter
        String[] fruitChoice = fruits.split(", ");

// Print each fruit
        System.out.println("Fruit Names:");
        System.out.println(fruitChoice[0]);
        System.out.println(fruitChoice[1]);
        System.out.println(fruitChoice[2]);
        System.out.println(fruitChoice[3]);
        System.out.println(fruitChoice[4]);

// charAt() - returns the char value at the specified index.
        String charAtExample = "Bharat";
        System.out.println(charAtExample.charAt(2));
// System.out.println(charAtExample.charAt(6)); // StringIndexOutOfBoundsException

// trim() - returns a string with all leading and trailing spaces removed.
        String trimExample = "   Trimmer   ";
        System.out.println(trimExample.trim());

// indexOf - returns the index of the first occurrence of the specified substring
        String IndexOfExample = "Rahul";
        System.out.println(IndexOfExample.indexOf("h"));
        System.out.println(IndexOfExample.indexOf("l"));

// contains - returns true if and only if this string contains the specified sequence of char values
        String ContainsExample = "ContainsExample";
        System.out.println(ContainsExample.contains("Ex"));
        System.out.println(ContainsExample.contains("Out"));

// indexOf - Returns the index of the first occurrence of the specified substring.
// lastIndexOf - Returns the index of the last occurrence of the specified substring.
        String LastIndexExample = "Programming";
        System.out.println(LastIndexExample.lastIndexOf("g"));
        System.out.println(LastIndexExample.indexOf("g"));

// replace - to replace and replaceAll
        String replaceExample = "Hello";
        System.out.println(replaceExample.replace("H", "J")); // replace cannot do regex

        String replaceAllExample = "Welcome123 to 456Java";
        System.out.println(replaceAllExample.replaceAll("\\d+", " ")); // replaceAll can do regex

// startsWith & endsWith
        String startExample = "Developer";
        System.out.println(startExample.startsWith("Dev")); // Boolean - True or false
        System.out.println(startExample.endsWith("per")); // Boolean - True or false
        System.out.println(startExample.endsWith("De")); // Boolean - True or false
    }
}
