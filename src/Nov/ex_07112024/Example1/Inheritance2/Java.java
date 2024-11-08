package Nov.ex_07112024.Example1.Inheritance2;

import org.w3c.dom.ls.LSOutput;

public class Java extends Programming {
    //extends ---> is a
    // Java extends means java is a programming
    void print (){

        System.out.println(version); //
        System.out.println(aothor);  //
    };

    public static void main(String[] args) {
        Java p1 =new Java();
        System.out.println(p1.aothor);
        System.out.println(p1.version);

        }

        Java(){
            System.out.println("Default constructor");

    };


}
