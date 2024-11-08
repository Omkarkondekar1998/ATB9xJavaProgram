package Nov.ex_07112024.Example1.Inheritance;

public class Lab145_Single_Inheritance {
    public static void main(String[] args) {
        // Single Inheritance

        // Here son will get attributes from Father directly.
        //One Son and one father getting involved here.


    }

    public static class Father_Class {
        int Gold = 1000;
        void BHK2 (){
            System.out.println("2BHK");

            Son_Class S1 = new Son_Class();

            System.out.println(S1.Gold);  // here, Father can access all from Son.
            S1.BHK2();  // here, Father can access all from Son.
            S1.BHK3();  // here, Father can access all from Son.

            Father_Class F1 = new Father_Class();

           //  F1.BHK3();  This is not possible because father has not extended here.

        }
    }
}
