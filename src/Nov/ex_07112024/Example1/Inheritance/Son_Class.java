package Nov.ex_07112024.Example1.Inheritance;

public class Son_Class extends Lab145_Single_Inheritance.Father_Class {
        void BHK3(){
            System.out.println("3BHK");

            //Here son Cannot Access the Gold from Father until I do extends.
            System.out.println(Gold); //Gold is attribute of father
            // also son can access father's 2BHK
            BHK2(); // and this is behaviour of father
        }

}
