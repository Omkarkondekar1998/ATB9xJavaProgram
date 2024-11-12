package Nov.ex_07112024.Example1.Hierarchical_Inheritance08112024;

public class Lab148_Hierarchical {
    public static void main(String[] args) {
        Amu a = new Amu();
        a.h3(); // his own
        a.h1(); // from father

        Omkar o = new Omkar();

        o.h2(); // his own
        o.h1(); // from father

        None n = new None();

        n.none(); // his own
        n.h1(); // from father

        Father f = new Father();

        f.h1();// his own
    }
}
