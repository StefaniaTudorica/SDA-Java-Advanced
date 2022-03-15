package ro.sda.stefania.composition;

/**
 * Write a Java class Author with following features:
 * Instance variables :
 * firstName for the author’s first name of type String.
 * lastName for the author’s last name of type String.
 * Constructor:
 * A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
 * Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out author’s name to the screen
 * Write a Java class Book with following features:
 * Instance variables :
 * title for the title of book of type String.
 * author for the author’s name of type String.
 * price for the book price of type double.
 * Constructor:
 * A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
 * Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out book’s details to the screen
 * Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println)
 */
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Andrei", "Paunescu");
        Book book = new Book("Developing Java Software", author, 79.75);
        System.out.println(book);


    }
}
