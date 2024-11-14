package Nov.ex_12112024;

public class Lab158 {
    public static void main(String[] args) {
        child c = new child();
        c.loan50k();
        c.loan25k();
    }

}

class child extends father{


    @Override
    void loan50k() {
        System.out.println("Child is giving loan!");
    }
}

abstract class father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Paid by father!");
    }
}
