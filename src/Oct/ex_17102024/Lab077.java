package Oct.ex_17102024;

import java.util.Scanner;

public class Lab077 {

    public static void main(String[] args) {
        //can we have 2 or more outputs?

        //Condition1 a>b
        //condition a<b
        //a==b
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1 =");
        int a = scanner.nextInt();
        System.out.println("Enter number2 =");
        int b = scanner.nextInt();




        if(a>b)

        {
            System.out.println("a is greater than b.");
        }

        else if(a<b)
        {
            System.out.println("b is greater than a");
        }
        else
        {
            System.out.println("A is equal to b.");
        }

    }
}
