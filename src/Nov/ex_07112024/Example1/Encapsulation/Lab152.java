package Nov.ex_07112024.Example1.Encapsulation;

public class Lab152 {

    public static void main(String[] args) {
        // Creating an instance of VWOLogin
        VWOLogin vwoLogin = new VWOLogin("Admin", "Password123");

        // Printing the original password using the getter method
        System.out.println("Original Password: " + vwoLogin.getPassword());

        // Changing the password using the setter method
        vwoLogin.setPassword("hacker");

        // Printing the modified password using the getter method
        System.out.println("Modified Password: " + vwoLogin.getPassword());
    }
}

// VWOLogin class with encapsulated fields
class VWOLogin {

    private String username;
    private String password;

    // Constructor to initialize username and password
    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }

    // Setter method for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for username (if needed)
    public String getUsername() {
        return username;
    }

    // Setter for username (if needed)
    public void setUsername(String username) {
        this.username = username;
    }
}

