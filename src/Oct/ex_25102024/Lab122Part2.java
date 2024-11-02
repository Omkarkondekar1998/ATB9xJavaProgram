package Oct.ex_25102024;

public class Lab122Part2 {
    public static void main(String[] args) {

        String first = "SCP";   // Stored in SCP
        String Second = "SCP"; // Stored in SCP

        String Third = new String("SCP"); // Stored in OA
        String Forth = new String("SCP"); // Stored in OA

        // In scp 1 and in OA 2

        System.out.println(first == Forth);   //false
        System.out.println(first == Second);  // True
        System.out.println(first == Third);   //false
        System.out.println(Third == Forth);   //Forth

        System.out.println(first.equals(Third)); //True because content is same SCP

    }
}
