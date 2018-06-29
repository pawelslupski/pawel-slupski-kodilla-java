package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> borrowedBookList = new ArrayList<Book>();
        List<Book> resultBorrowedBookList = libraryDatabase.listBooksInHandsOf(libraryUser);

        borrowedBookList = resultBorrowedBookList;

        return borrowedBookList;
    }
}
