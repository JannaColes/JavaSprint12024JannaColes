import java.util.Objects;

// Represents a book in the library
public class Book implements Borrowable { 
  private String title;
  private Author author;
  private String ISBN;
  private String publisher;
  private int numCopies;
  private Status status;

  // Constructor to create a new book
  public Book(String title, Author author, String ISBN, String publisher, int numCopies) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.publisher = publisher;
    this.numCopies = numCopies;
    this.status = Status.AVAILABLE;
  }

  // Getters and setters for the Book attributes
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getNumCopies() {
    return numCopies;
  }

  public void setNumCopies(int numCopies) {
    this.numCopies = numCopies;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  // Method to borrow a book
  public void borrowBook(int numCopies) {
    if (this.numCopies >= numCopies) {
      this.numCopies -= numCopies;
      System.out.println(numCopies + " copies of " + title + " borrowed successfully.");
      status = Status.CHECKED_OUT;
    } else {
      System.out.println("Not enough copies available to borrow.");
    }
  }

  // Method to return a book
  public void returnBook(int numCopies) {
    this.numCopies += numCopies;
    System.out.println(numCopies + " copies of " + title + " returned successfully.");
    status = Status.AVAILABLE;
  }


  // Equals and hashCode methods to compare Book objects
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return ISBN.equals(book.ISBN);
  }

  public int hashCode() {
    return Objects.hash(ISBN);
  }
}