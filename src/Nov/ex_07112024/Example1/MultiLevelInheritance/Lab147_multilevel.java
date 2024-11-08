package Nov.ex_07112024.Example1.MultiLevelInheritance;

public class Lab147_multilevel {
    public static void main(String[] args) {

        Child c = new Child();
        c.home();
        c.extra();
        c.c();
        Father f1 = new Father();
        f1.fa();
        f1.gf();
        f1.home();
        f1.extra();

    }
}
