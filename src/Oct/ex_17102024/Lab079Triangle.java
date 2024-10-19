package Oct.ex_17102024;

import java.util.Scanner;

public class Lab079Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of first side A-  ");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the length of first side B-  ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter the length of first side C-  ");
        double sideC = scanner.nextDouble();

        if (sideA <=0 || sideB <= 0 || sideC <= 0)

            System.out.println("Lengths must be POSITIVE");
        else if (sideA == sideB && sideA == sideC)

            System.out.println("Triangle is Equilateral Triangle!");

        else if(sideA == sideB || sideB == sideC)

            System.out.println("Triangle is Isosceles Triangle!");

        else
            System.out.println("Triangle is scalene Triangle!");

        scanner.close();
    }
}
