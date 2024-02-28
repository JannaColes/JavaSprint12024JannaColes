public class LibraryTest {
  public static void main(String[] args) {
      // Create authors
      Author author1 = new Author("John Doe", "1980-05-15");
      Author author2 = new Author("Jane Smith", "1975-10-20");

      // Create books
      Book book1 = new Book("Java Programming", author1, "1234567890", "ABC Publications", 5);
      Book book2 = new Book("Python Basics", author2, "0987654321", "XYZ Books", 3);

      // Create patrons
      Patron patron1 = new Patron("Alice", "123 Main St", "123-456-7890");
      Patron patron2 = new Patron("Bob", "456 Elm St", "456-789-0123");

      // Create library
      Library library = new Library();

      // Add authors to the library
      library.addAuthor(author1);
      library.addAuthor(author2);

      // Add books to the library
      library.addBook(book1);
      library.addBook(book2);

      // Add patrons to the library
      library.addPatron(patron1);
      library.addPatron(patron2);

      // Test 1: Borrow a book
      System.out.println("Test 1: Borrow a book");
      library.borrowBook(patron1, book1, 2);

      // Test 2: Borrow another book
      System.out.println("\nTest 2: Borrow another book");
      library.borrowBook(patron2, book2, 1);

      // Test 3: Return a book
      System.out.println("\nTest 3: Return a book");
      library.returnBook(patron1, book1, 1);

      // Test 4: Return another book
      System.out.println("\nTest 4: Return another book");
      library.returnBook(patron2, book2, 1);

      // Test 5: Search for a book by title
      System.out.println("\nTest 5: Search for a book by title");
      Book searchedBookByTitle = library.searchBookByTitle("Java Programming");
      System.out.println("Book found: " + searchedBookByTitle.getTitle());

      // Test 6: Search for a book by author
      System.out.println("\nTest 6: Search for a book by author");
      Book searchedBookByAuthor = library.searchBookByAuthor("Jane Smith");
      System.out.println("Book found: " + searchedBookByAuthor.getTitle());

      // Test 7: Search for a book by ISBN
      System.out.println("\nTest 7: Search for a book by ISBN");
      Book searchedBookByISBN = library.searchBookByISBN("0987654321");
      System.out.println("Book found: " + searchedBookByISBN.getTitle());

      // Test 8: Borrow multiple copies of a book
      System.out.println("\nTest 8: Borrow multiple copies of a book");
      library.borrowBook(patron1, book1, 3);

      // Test 9: Attempt to borrow more copies than available
      System.out.println("\nTest 9: Attempt to borrow more copies than available");
      library.borrowBook(patron2, book2, 5);

      // Test 10: Return multiple copies of a book
      System.out.println("\nTest 10: Return multiple copies of a book");
      library.returnBook(patron1, book1, 2);

      // Test 11: Attempt to return more copies than borrowed
      System.out.println("\nTest 11: Attempt to return more copies than borrowed");
      library.returnBook(patron1, book1, 3);

      // Test 12: Test if a book is available after returning
      System.out.println("\nTest 12: Test if a book is available after returning");
      System.out.println("Book status before return: " + book1.getStatus());
      library.returnBook(patron1, book1, 1);
      System.out.println("Book status after return: " + book1.getStatus());

      // Test 13: Test if a book is checked out after borrowing
      System.out.println("\nTest 13: Test if a book is checked out after borrowing");
      System.out.println("Book status before borrow: " + book2.getStatus());
      library.borrowBook(patron2, book2, 1);
      System.out.println("Book status after borrow: " + book2.getStatus());

      // Test 14: Test if a book is marked as overdue
      System.out.println("\nTest 14: Test if a book is marked as overdue");
      // For demonstration purposes, manually set the status to OVERDUE
      book2.setStatus(Status.OVERDUE);
      System.out.println("Book status: " + book2.getStatus());

      // Test 15: Add a new patron
      System.out.println("\nTest 15: Add a new patron");
      Patron patron3 = new Patron("Charlie", "789 Oak St", "789-012-3456");
      library.addPatron(patron3);
      System.out.println("New patron added: " + patron3.getName());

      // Test 16: Add a new author
      System.out.println("\nTest 16: Add a new author");
      Author author3 = new Author("Emily Johnson", "1990-03-25");
      library.addAuthor(author3);
      System.out.println("New author added: " + author3.getName());

      // Test 17: Add a new book
      System.out.println("\nTest 17: Add a new book");
      Book book3 = new Book("JavaScript Basics", author3, "5432109876", "DEF Publishers", 10);
      library.addBook(book3);
      System.out.println("New book added: " + book3.getTitle());

      // Test 18: Remove an author
      System.out.println("\nTest 18: Remove an author");
      library.removeAuthor(author3);
      System.out.println("Author removed: " + author3.getName());

      // Test 19: Remove a book
      System.out.println("\nTest 19: Remove a book");
      library.removeBook(book3);
      System.out.println("Book removed: " + book3.getTitle());

      // Test 20: Remove a patron
      System.out.println("\nTest 20: Remove a patron");
      library.removePatron(patron3);
      System.out.println("Patron removed: " + patron3.getName());
  }
}
