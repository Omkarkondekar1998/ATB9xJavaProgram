package Nov.ex06112024;

// Lab143_Explaination class: The main class of the program which contains the entry point (main method)
public class Lab143_Explaination {

    // Main method: Entry point for the Java program
    public static void main(String[] args) {

        // Creating a new car2 object with model "Tesla" and year "2015"
        // This calls the parameterized constructor of the car2 class
        car2 t1 = new car2("Tesla", "2015");

        // Optionally, display the car details after initialization
        t1.displayDetails();
    }
}

// car2 class: Represents a car with model and year as its attributes
class car3 {

    // Instance variables (fields) of the car2 class
    String model;  // Variable to store the car model (e.g., "Tesla")
    int Year;      // Variable to store the year of the car (e.g., 2015)

    // Parameterized constructor for car2 class
    // This constructor takes two parameters: one for model (String) and one for year (String)
    // The constructor will initialize the object when it's created
    car3(String model, String Year) {
        System.out.println("Parameterized constructor");

        // Initialize the model field with the provided model
        this.model = model;

        // Convert the string Year to an integer and initialize the Year field
        this.Year = Integer.parseInt(Year); // Convert String to int
    }

    // Method to display car details (model and year)
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + Year);
    }
}




