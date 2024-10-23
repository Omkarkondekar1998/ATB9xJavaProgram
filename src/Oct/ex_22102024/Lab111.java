package Oct.ex_22102024;

public class Lab111 {

    public static void main(String[] args) {

        // 1. Argument
        // 2. Scanner class
        // 3. Buffer reader

        // Take a user input for the age and print the output one by one.

        String ageString = args[0]; // Get the first command-line argument


        int age = Integer.parseInt(ageString);  //Convert the string to an integer

     //   System.out.println(age); //Print the converted age

        while(age>0){

            System.out.println(age);
            age--;
        }

        System.out.println("1");

    }
}
