package Oct.ex_17102024;

import java.util.Scanner;

public class Lab075 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num = scanner.nextInt();

        if
        (num%2 == 0)
        {
            System.out.println("Entered number is even.");
        }
        else
        {
            System.out.println("Entered number is Odd");
        }
        scanner.close();

    }
}
