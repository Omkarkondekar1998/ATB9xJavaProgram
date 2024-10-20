package Oct.ex_18102024;

import java.util.Scanner;

public class Task_1801 {

    public static void main(String[] args) {
     //   Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

         //       Inputs :   num 1, num 2, +
          //      Output :  num1+num2 → print information.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number");

        double number1 = scanner.nextDouble();

        System.out.println("Enter 2nd Number");

        double number2 = scanner.nextDouble();


        System.out.println("Enter Operator(+, -, *, /)");
        char operator = scanner.next().charAt(0);

        double result;


        switch(operator){

            case '+':

                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;

            case '-':

                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;


            case '*':

                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);

            case '/':

                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            default:

                System.out.println("Error: Invalid operator.");
                break;

        }

    }
}
