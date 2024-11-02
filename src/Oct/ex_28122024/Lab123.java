package Oct.ex_28122024;

import java.sql.SQLOutput;

public class Lab123 {

    public static void main(String[] args) {

        //commonly used function - substring ( Used for extratct portion of the String)

        String string = "Butterscotch"; //// Extract a substring from the string

        String Substring = string.substring(0,6); //// This will get characters from index 0 to index 6 (not including 6)

        System.out.println(Substring); // Print the extracted substring


        //commonly used function - Concatenation (Used to combine two strings)

        String Firstname = "Omkar";

        String Full_Name = Firstname.concat(" Kondekar"); //concatenation of Strings

        System.out.println(Full_Name);

        //by +, multiple strings can be concatenation

        String a1 = "Mr.";
        String a2 = "Omkar";
        String a3 = "Kondekar";

        System.out.println(a1+ " "+a2+ " "+a3+" ");

        //splitting the string

        // A sentence with ice cream flavors separated by commas
        String flavors = "Vanilla, Chocolate, Strawberry, Mint, Cookies and Cream";

        // Split the sentence using a comma as a delimiter
        String[] flavorchoice = flavors.split(", ");

        // Print each flavor
        System.out.println("Ice Cream Flavors:");
        System.out.println(flavorchoice[0]);
        System.out.println(flavorchoice[1]);
        System.out.println(flavorchoice[2]);
        System.out.println(flavorchoice[3]);
        System.out.println(flavorchoice[4]);

        //CharAt() -  returns the char value at the specified index.

        String charat = "Aashay";
        System.out.println(charat.charAt(0));
       // System.out.println(charat.charAt(9)); //StringIndexOutOfBoundsException

        //Trim() - returns a string whose value is this string, with all leading and trailing spaces removed.

        String trim = " Trimmer      ";

        System.out.println(trim.trim());

        //indexof - returns the index of the first occurrence of the specified substring

        String Index_of = "Omkar";

        System.out.println(Index_of.indexOf("k"));
        System.out.println(Index_of.indexOf("r"));

        // contains - returns true if and only if this string contains the specified sequence of char values

        String Contains = "Contains";

        System.out.println(Contains.contains("in"));
        System.out.println(Contains.contains("out"));

        //index of - Returns the index of first occurrence of the specified substring.
        //last index of  - Returns the index of last occurrence of the specified substring.

        String Last_Index = "Array";
        System.out.println(Last_Index.lastIndexOf("r"));
        System.out.println(Last_Index.indexOf("r"));

        // Replace - to replace and replaceall

        String replace = "Mood";

        System.out.println(replace.replace("M","G"));           //replace cannot do regex

        String replace_all = "Platinum @ 393930";
        System.out.println(replace_all.replaceAll("\\d+"," "));  //replace all can do regex


        //starts with & ends with

        String start = "Omkar";
        System.out.println(start.startsWith("Om")); //Boolean - True or false
        System.out.println(start.endsWith("kar")); //Boolean - True or false
        System.out.println(start.endsWith("Om")); //Boolean - True or false






}
}
