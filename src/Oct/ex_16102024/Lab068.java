package Oct.ex_16102024;

public class Lab068 {

    public static void main(String[] args) {
        // Creating a program to check Omkar can vote or not.

        // Take a input Age =Omkar

       // age-> 18

        //
        int Age= Integer.parseInt(args[3]);
        int Age1= Integer.parseInt(args[1]);
        int Age2= Integer.parseInt(args[2]);
        int Age3= Integer.parseInt(args[3]);
        // to print all argument values
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        //Can vote or not

        System.out.println(Age>18? "Can Vote":"Cannot Vote");

        //to print in single line

        System.out.printf("%s, %s,%s,%s", args[0],args[1],args[2],args[3]);


    }
}
