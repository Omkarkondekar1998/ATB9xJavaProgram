package Nov.ex_11112024.Real;

public class Testcase1 extends Base_class {

    public Testcase1(){
        super(); //Parent Constructor - super means parent
        //this - current object


        System.out.println("Default Constructor - TC1");
    }

    public void startTestCase(){
        openBrowser("Chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isauth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isauth);
    }
}
