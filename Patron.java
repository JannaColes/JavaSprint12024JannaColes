import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Represents a patron in the library
public class Patron {
  private String name; // Patron's name
  private String address; // Patron's address
  private String phoneNumber; // Patron's phone number
  private List<Book> borrowedBooks; // List of books borrowed by the patron

  // Constructor to initialize a new patron
  public Patron(String name, String address, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.borrowedBooks = new ArrayList<>();
  }

  // Getters and setters for the Patron attributes
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void  setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(List<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  // Method to borrow a book
  public void borrowBook(Book book, int numCopies) {
    book.borrowBook(numCopies);
    borrowedBooks.add(book);
  }

  // Method to return a book
  public void returnBook(Book book, int numCopies) {
    book.returnBook(numCopies);
    borrowedBooks.remove(book);
  }

  // Equals and hashCode methods to compare Patron objects
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Patron patron = (Patron) o;
    return phoneNumber.equals(patron.phoneNumber);
  }

  public int hashCode() {
    return Objects.hash(phoneNumber);
  }

 
}
