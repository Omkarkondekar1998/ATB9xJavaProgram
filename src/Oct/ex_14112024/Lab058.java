package Oct.ex_14112024;

public class Lab058 {

    public static void main(String[] args) {
        long accountBalance = 500000L; // Account balance in long
        int withdrawalAmount = 200000;   // Withdrawal amount in int

        // Explicit narrowing occurs here
        int newBalance = (int) (accountBalance - withdrawalAmount);
        // Explicit narrowing from long to int

        System.out.println(newBalance); // Print the new balance directly

        short phone_no = (short) 9039039039l;

        short s= phone_no; //Implicit- By JVM

        s = (short) phone_no;



    }
}
