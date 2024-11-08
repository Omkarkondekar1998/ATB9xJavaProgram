package Nov.ex_07112024.Example1.Inheritance3;

public class Testcase1 extends CommonBaseTest{
    public Testcase1() {
        System.out.println("Default Constructor- Child");
    }

    void Testcase(){

        startbrowser();
        readingafile();
        closingbrowser();
    }
}
