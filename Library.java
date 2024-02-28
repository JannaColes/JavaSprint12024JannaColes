import java.util.ArrayList;
import java.util.List;

// Represents a library
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    // Constructor to create a new library
    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Method to add an author to the library
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Method to remove an author from the library
    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    // Method to add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to remove a patron from the library
    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    // Method to search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Method to search for a book by author
    public Book searchBookByAuthor(String authorName) {
        for (Book book : books) {
            if (book.getAuthor().getName().equals(authorName)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Method to search for a book by ISBN
    public Book searchBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Method to borrow a book
    public void borrowBook(Patron patron, Book book, int numCopies) {
        if (book.getStatus() == Status.AVAILABLE) {
            if (book.getNumCopies() >= numCopies) {
                book.setStatus(Status.CHECKED_OUT);
                book.setNumCopies(book.getNumCopies() - numCopies);
                System.out.println(numCopies + " copies of " + book.getTitle() + " borrowed successfully.");
            } else {
                System.out.println("Not enough copies available to borrow.");
            }
        } else {
            System.out.println("The book is currently checked out.");
        }
    }

    // Method to return a book
    public void returnBook(Patron patron, Book book, int numCopies) {
        book.setStatus(Status.AVAILABLE);
        book.setNumCopies(book.getNumCopies() + numCopies);
        System.out.println(numCopies + " copies of " + book.getTitle() + " returned successfully.");
    }
}
