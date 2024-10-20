package Oct.ex_18102024;

import java.util.Scanner;

public class Lab081 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser name");

        String browser = sc.next();

        switch (browser)
        {
            case "chrome" :
                System.out.println("Starting the chrome.");
                break;

            case "edge" :
                System.out.println("Starting the edge.");
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                break;

            default:
                System.out.println("No idea what browser is!");



        }



    }
}
