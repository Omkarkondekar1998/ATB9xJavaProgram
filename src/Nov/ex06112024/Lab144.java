package Nov.ex06112024;

import java.util.Scanner;

public class Lab144 {

    public static void main(String[] args) {

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input book details
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();  // Get the title of the book from user input

        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine(); // Get the author's name from user input

        System.out.print("Enter the publication year: ");
        int year = scanner.nextInt(); // Get the publication year from user input (integer)

        // Creating a new Book object with user-provided title, author, and year
        Book b1 = new Book(title, author, year);

        // Displaying the book details using the displayDetails() method
        b1.displayDetails();

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

// Book class: Represents a book with title, author, and publication year as its attributes
class Book {

    // Instance variables (fields) of the Book class.
    String title;  // Variable to store the book's title (e.g., "Lucky").
    String author; // Variable to store the author's name (e.g., "Omkar").
    int year;      // Variable to store the publication year of the book (e.g., 1998).

    // Parameterized constructor for Book class
    // This constructor takes three parameters: one for the title (String), one for the author (String), and one for the publication year (int)
    Book(String title, String author, int year) {
        System.out.println("Parameterized constructor");

        // Initializing fields with provided values
        this.title = title;  // Assigning the title of the book
        this.author = author; // Assigning the author's name
        this.year = year;    // Assigning the publication year
    }

    // Method to display book details (title, author, and year)
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publication Year: " + year);
    }
}
