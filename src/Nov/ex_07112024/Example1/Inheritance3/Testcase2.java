package Nov.ex_07112024.Example1.Inheritance3;

public class Testcase2 extends CommonBaseTest{
    public Testcase2() {
        System.out.println("Default Constructor- Child");
    }

    void Testcase(){

        startbrowser();
        System.out.println("Testcase 2 Executing");
        readingafile();
        System.out.println("Testcase 2 Executing");
        closingbrowser();
        System.out.println("Testcase 2 Executing");

        }
    }

