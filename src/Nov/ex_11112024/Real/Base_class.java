package Nov.ex_11112024.Real;

import javax.naming.Name;

public class Base_class {
    String browser;

    Base_class() {
        System.out.println("Default Constructor - Base Class");
    }
    Base_class(String b) {
        System.out.println("Parameterised Constructor - Base Class");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isauth) {
        if(isauth){
            this.browser =browser;
        }
        else{
            System.out.println("Not Allowed!");
        }
    }

    void openBrowser(String browserName){
        System.out.println("Opening Browser");
    }
    void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
