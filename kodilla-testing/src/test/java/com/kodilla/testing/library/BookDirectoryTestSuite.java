package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<Book>();
            for(int n = 1; n <= booksQuantity; n++) {
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBookWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfReturnListInCaseOfZeroBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Opania", "87050503243");
        List<Book> resultEmptyListOfBorrowedBooks = new ArrayList<Book>();

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultEmptyListOfBorrowedBooks);

        // When
        List<Book> theEmptyListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(0, theEmptyListOfBorrowedBooks.size());
    }


    @Test
    public void testListBooksInHandsOfReturnListInCaseOfOneBook() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Opania", "87050503243");
        List<Book> resultListOfBorrowedBooks = new ArrayList<Book>();
        Book book1 = new Book("Harry potter and the philosopher's stone", "John Smith", 2002);

        resultListOfBorrowedBooks.add(book1);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBorrowedBooks);

        // When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(1, theListOfBorrowedBooks.size());
    }

    @Test
    public void testlistBooksInHandsOfReturnListInCaseOfFiveBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Opania", "87050503243");
        List<Book> resultListOfBorrowedBooks = new ArrayList<Book>();
        Book book1 = new Book("Harry potter and the philosopher's stone", "John Smith", 2002);
        Book book2 = new Book("Sex and the city", "Bushnell Candace", 2008);
        Book book3 = new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 2011);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Digital Fortress", "Dan Brown", 1998);
        resultListOfBorrowedBooks.add(book1);
        resultListOfBorrowedBooks.add(book2);
        resultListOfBorrowedBooks.add(book3);
        resultListOfBorrowedBooks.add(book4);
        resultListOfBorrowedBooks.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBorrowedBooks);

        // When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(5, theListOfBorrowedBooks.size());
    }
}
