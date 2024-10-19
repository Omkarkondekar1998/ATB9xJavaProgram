package Oct.ex_17102024;

import java.util.Scanner;

public class Lab078_Grading {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Enter your marks (0 to 100): \"");

        int marks = scanner.nextInt();

        if(marks>=91 && marks<= 100)

        { System.out.println("Your garde is A");}

        else if (marks>=81 &&marks<= 90)
        {
            System.out.println("Your grade is B");
        }

        else if (marks>=71 && marks<=80)
        {
            System.out.println("Your grade is C");
        }
        else if (marks>=61 && marks <=70)
        {
            System.out.println("Your grade is D");
        }
        else
        {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        }
        scanner.close();
    }
}
