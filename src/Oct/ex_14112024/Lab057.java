package Oct.ex_14112024;

public class Lab057 {

    public static void main(String[] args) {

        int deposit1 = 200000; // Deposit amount in int
        int deposit2 = 300000; // Another deposit amount in int

        // Implicit widening occurs here
        long totalBalance = deposit1 + deposit2; // sum of two ints is automatically widened to long

        System.out.println(totalBalance); // Print the total balance directly


            byte b =10;
            int a =b; //Valid-> Implicit casting -> Automatically done in compatible data type by JVM.
            int a1= (int)b; //Valid-. Explicit casting -> Done by user for sake of the purpose.


            //Converting large data type to small is called Narrowing, and it is done by user or/ java programmer hence called Explicit narrowing. small value store data as per his capacity other data will be lost.

            int Value =100;
           // byte b1= Value; //Invalid implicit cating
            byte b2=(byte)Value; // Explicit Narrowing- done by user





    }
}
