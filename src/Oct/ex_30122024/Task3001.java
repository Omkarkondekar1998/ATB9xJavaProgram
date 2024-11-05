package Oct.ex_30122024;

import java.util.Scanner;

public class Task3001 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");

        int n = scanner.nextInt();

        for (int i = n; i <n ; i--) {

            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
