package Nov.ex_12112024;

public class Lab157 {
}

class omkar extends Loan{

    @Override
    void loan50k() {
        System.out.println("Giving the loan!");
    }

    @Override
    void loan30k() {
        System.out.println("Giving the Loan");
    }
}

abstract class Loan{
abstract void loan50k ();
    abstract void loan30k ();

void loan1L(){
    System.out.println("1L loan is there.");
}
}

//concrete class
class person{}
class student{}
class student2{}
class student3{}

