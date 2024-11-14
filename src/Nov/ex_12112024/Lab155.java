package Nov.ex_12112024;

public class Lab155 {
    public static void main(String[] args) {
        car c  = new car();
    }

}

class car extends vehicle{
    private int maxspeed = 281;

    @Override
    void display() {
        System.out.println("Child");
    }

    car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
        super.display();
        this.display();
    }
}
class vehicle {
    public int maxspeed = 180;

    void display(){
        System.out.println("Parent");
    }

    vehicle(){
        System.out.println("DC Vehicle");
    }

    vehicle (int a ){
        System.out.println("PC Vehicle");
    }
    void message (){
        System.out.println("Hello Vehicle!");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }
}
