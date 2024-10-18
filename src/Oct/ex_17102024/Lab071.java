package Oct.ex_17102024;

import java.util.Scanner;

public class Lab071 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int age = scanner.nextInt();

        if (age > 18)
            System.out.println("allowed to Vote");
        else
            System.out.println("Your are not allowed!");
    }
}
