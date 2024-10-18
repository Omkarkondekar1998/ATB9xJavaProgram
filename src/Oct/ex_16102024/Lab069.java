package Oct.ex_16102024;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        //Scanner class

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Age");
        //Integer Input hence next int
        int age = scanner.nextInt();

        System.out.println(age>25?"Allowed to work":"Not allowed to work");

        float Cutoff = scanner.nextFloat();

        System.out.println(Cutoff>18.45f?"You are passed":"You are failed");


        double Cutoff2 = scanner.nextDouble();

        System.out.println(Cutoff2>19.45d?"You are passed":"You are failed");

        scanner.close();

    }
}
