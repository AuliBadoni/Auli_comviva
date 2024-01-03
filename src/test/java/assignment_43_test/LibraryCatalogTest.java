package assignment_43_test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import assignment_43.Book;
import assignment_43.LibraryCatalog;

public class LibraryCatalogTest {

    private LibraryCatalog libraryCatalog;

    @Before
    public void setup() {
        libraryCatalog = new LibraryCatalog();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        libraryCatalog.addBook(book);

        List<Book> books = libraryCatalog.getBooks();
        assertEquals(1, books.size());
        assertSame(book, books.get(0));
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryCatalog.addBook(book);

        libraryCatalog.borrowBook("To Kill a Mockingbird");

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("1984", "George Orwell");
        libraryCatalog.addBook(book);

        // Borrow the book first
        libraryCatalog.borrowBook("1984");

        // Return the book
        libraryCatalog.returnBook("1984");

        assertTrue(book.isAvailable());
    }

}
