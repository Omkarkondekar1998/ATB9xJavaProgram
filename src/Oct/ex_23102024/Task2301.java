package Oct.ex_23102024;

import java.util.Scanner;

public class Task2301 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a= scanner.nextInt();

        System.out.println("Enter Second Number");
        int b= scanner.nextInt();

        int result = sum_result(a,b);
        System.out.println("Sum is ->" +result);

        int result_Sub = sub_result(a,b);
        System.out.println("Sub is->" +result_Sub);

        int mul_result = mul_result(a,b);

        System.out.println("Multiplication is ->" +mul_result);

        System.out.println(a*b);

        int div_result = div_result(a,b);

        System.out.println("Division is -> " + div_result);


        scanner.close();
    }

    static int div_result(int a, int b) {

        return a/b;

    }

    static int mul_result(int a, int b) {

        return a*b;
    }

    static int sum_result(int a, int b){

        return a+b;

    }

   static int sub_result (int a, int b){
        return a-b;


    }
}
