package com.kodilla.patterns2.adapter.classifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Dan Brown", "Angels and Demons", 2000,
                "012323");
        Book book2 = new Book("Steven Hawking", "The Theory of Everything", 2010,
                "022323");
        Book book3 = new Book("Dan Brown", "Inferno", 2013, "434234");
        Book book4 = new Book("Steven King", "Misery", 1987, "546323");
        Book book5 = new Book("Steven King", "EndOfWatch", 2016, "324298");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(median, 2010, 0);
    }
}
