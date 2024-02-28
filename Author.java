import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Represents an author of a book
public class Author {
  private String name;
  private String dateOfBirth;
  private List<Book> booksWritten;

  // Constructor to create a new author
  public Author(String name, String dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.booksWritten = new ArrayList<>();
  }

  // Getters and setters for the Author attributes
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public List<Book> getBooksWritten() {
    return booksWritten;
  }
  
  public void setBooksWritten(List<Book> booksWritten) {
    this.booksWritten = booksWritten;
  }

  // Method to add a book written by the author
  public void addBook(Book book) {
    this.booksWritten.add(book);
  }

  // Override the equals method
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Author author = (Author) o;
    return name.equals(author.name);
  }

  // Override the hashCode method
  public int hashCode() {
    return Objects.hash(name);
  }


}
